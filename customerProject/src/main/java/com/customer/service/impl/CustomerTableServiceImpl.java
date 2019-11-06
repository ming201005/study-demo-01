package com.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.customer.dao.CustomerTableDao;
import com.customer.entity.CustomerTable;
import com.customer.service.CustomerTableService;
import org.springframework.stereotype.Service;

/**
 * (CustomerTable)表服务实现类
 *
 * @author makejava
 * @since 2019-11-05 19:38:03
 */
@Service("customerTableService")
public class CustomerTableServiceImpl extends ServiceImpl<CustomerTableDao, CustomerTable> implements CustomerTableService {

}