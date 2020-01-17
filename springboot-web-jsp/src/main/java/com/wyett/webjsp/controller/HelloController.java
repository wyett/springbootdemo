package com.wyett.webjsp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/1/17 18:26
 * @description: TODO
 */

@RestController
public class HelloController {
    @RequestMapping("/wyett")
    public String hello() {
        return "hello,world";
    }

}
