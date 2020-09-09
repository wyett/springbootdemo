package com.wyett.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatis config
 **/
@Configuration
@EnableTransactionManagement //开启事务
@MapperScan(basePackages = {"com.wyett.mapper","com.wyett.dao"})
public class MybatisConfiguration {
}
