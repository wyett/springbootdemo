package com.wyett.helloworld.controller;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/4 11:20
 * @description: TODO
 */

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    //@RequestMapping("/hello")
    //public String hello() {
    //    return "Hello, World!";
    //}

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello, " + who);
    }
}
