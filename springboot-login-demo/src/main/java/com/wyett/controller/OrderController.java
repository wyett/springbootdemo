package com.wyett.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/15 11:25
 * @description: TODO
 */

@RestController
public class OrderController {

    @GetMapping("/order")
    public String order() {
        return "order";
    }
}
