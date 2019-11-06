package com.customer.controller;

import com.customer.entity.CustomerTable;
import com.customer.service.CustomerTableService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.api.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * (CustomerTable)控制层，建议不要修改，如果有新增的方法，在子类中写
 *
 * @author makejava
 * @since 2019-11-05 19:38:03
 */
public class CustomerTableController {
  
    @Autowired
    CustomerTableService customerTableService;   
  
   /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param customerTable 查询实体
     * @return 所有数据
     */
    @GetMapping
    @CrossOrigin
    public R<IPage<CustomerTable>>  selectAll(Page<CustomerTable> page, CustomerTable customerTable) {
        return R.ok (this.customerTableService.page(page, new QueryWrapper<>(customerTable)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @CrossOrigin
    public R<CustomerTable> selectOne(@PathVariable Serializable id) {
        return R.ok(this.customerTableService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param customerTable 实体对象
     * @return 新增结果
     */
    @PostMapping
    @CrossOrigin
    public R<Integer> insert(@RequestBody CustomerTable customerTable) {
        boolean rs = this.customerTableService.save(customerTable);
        
        return R.ok(rs?customerTable.getId():0);
    }

    /**
     * 修改数据
     *
     * @param customerTable 实体对象
     * @return 修改结果
     */
    @PutMapping
    @CrossOrigin
    public R<Integer>  update(@RequestBody CustomerTable customerTable) {
        boolean rs = this.customerTableService.updateById(customerTable);
        return R.ok(customerTable.getId());
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    @CrossOrigin
    public R<Boolean> delete(@RequestParam("idList") List<Long> idList) {
        return R.ok(this.customerTableService.removeByIds(idList));
    }
}