package com.wyett.springbootpropertiesdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/5 17:39
 * @description: TODO
 */

@RestController
//@ResponseBody
//@Controller
public class HelloController {

//    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}
