package com.wyett.companyJedis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2021/2/8 17:49
 * @description: TODO
 */

@Configuration
public class JedisConfiguration {

    @Value("${jedis.connection.url}")
    private String jedisUrl;


    @Value("${jedis.connection.passwd}")
    private String jedisPwd;
}
