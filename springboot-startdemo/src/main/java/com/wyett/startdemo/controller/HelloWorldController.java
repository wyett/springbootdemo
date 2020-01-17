package com.wyett.startdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/1/17 12:18
 * @description: TODO
 */

@RestController
public class HelloWorldController {
    @RequestMapping("/wyett")
    public String sayHello(){
        return "hello, world";
    }
}
