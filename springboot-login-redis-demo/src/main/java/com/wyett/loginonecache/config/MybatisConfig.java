package com.wyett.loginonecache.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/10 12:01
 * @description: TODO
 */

@Configuration
@EnableTransactionManagement
@MapperScan({"com.wyett.loginonecache.dao", "com.wyett.loginonecache.mapper"})
public class MybatisConfig {
}
