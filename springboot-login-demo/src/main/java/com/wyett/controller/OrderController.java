package com.wyett.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/15 11:25
 * @description: TODO
 */

@Slf4j
@RestController
public class OrderController {

    @GetMapping("/order")
    public String order() {
        log.info("order");
        return "order";
    }
}
