package com.customer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.customer.dao")
public class CustomerApp {

    public  static  void main(String[] agrs) {

        SpringApplication.run (CustomerApp.class,agrs);
    }
}
