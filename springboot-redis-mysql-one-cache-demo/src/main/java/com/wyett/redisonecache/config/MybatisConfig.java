package com.wyett.redisonecache.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/5 17:57
 * @description: TODO
 */

@Configuration
@EnableTransactionManagement
@MapperScan({"com.wyett.redisonecache.dao", "com.wyett.redisonecache.mapper"})
public class MybatisConfig {
}
