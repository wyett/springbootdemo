package com.wyett.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/13 10:15
 * @description: TODO
 */

@RestController
public class TestController {
    public static final Logger logger = LoggerFactory.getLogger("TestController.class");

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/testSentinel")
    public void testSentinel() {
        int i = 1;
        while (true) {
            try {
                stringRedisTemplate.opsForValue().set("wyett" + i, String.valueOf(i));
                System.out.println("set key:" + "wyett" + i);
                i++;
                Thread.sleep(1000);

            } catch (Exception e) {
                logger.error("error" + e);
            }
        }
    }



}
