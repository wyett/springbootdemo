package com.wyett.logconfig.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/2/25 16:21
 * @description: TODO
 */

@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/")
    public String sayHello(@RequestParam(required = false) String who) {
        log.trace("log in sayHello() when {}", who);
        log.debug("log in sayHello() when {}", who);
        log.info("log in sayHello() when {}", who);
        log.warn("log in sayHello() when {}", who);
        log.error("log in sayHello() when {}", who);
        return "Hello, " + who;
    }
}
