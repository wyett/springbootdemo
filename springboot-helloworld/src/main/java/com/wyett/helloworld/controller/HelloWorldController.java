package com.wyett.helloworld.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/4 11:20
 * @description: TODO
 */

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
