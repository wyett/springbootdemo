package com.wyett.controller;

import com.wyett.config.RedisKeyPrefixConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : wyettLei
 * @date : Created in 2021/11/26 16:16
 * @description: TODO
 */

@Controller
@EnableConfigurationProperties(value = RedisKeyPrefixConfig.class)
public class ConfigController {

    @Autowired
    RedisKeyPrefixConfig redisKeyPrefixConfig;

    @RequestMapping("/")
    public void print(@RequestBody String msg) {
        System.out.println(redisKeyPrefixConfig.getPrefix());
        System.out.println(redisKeyPrefixConfig.getExpire());
        System.out.println(msg);
    }
}
