package com.wyett.sba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/2/24 14:44
 * @description: TODO
 */

@RestController
public class HelloController {
    @RequestMapping(value = {"", "/"})
    public String sayHello() {
        return "Hello, spring boot admin starter-client";
    }
}
