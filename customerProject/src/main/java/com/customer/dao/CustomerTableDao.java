package com.customer.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.customer.entity.CustomerTable;
import org.apache.ibatis.annotations.Mapper;

/**
 * (CustomerTable)表数据库访问层
 *
 * @author makejava
 * @since 2019-11-05 19:38:03
 */

public interface CustomerTableDao extends BaseMapper<CustomerTable> {

}