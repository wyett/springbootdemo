package com.wyett.springbootdruiddemo.controller;

import com.wyett.springbootdruiddemo.service.DruidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * @author : wyettLei
 * @date : Created in 2020/10/9 17:25
 * @description: TODO
 */

@Slf4j
@RestController
@RequestMapping("/druid")
public class DruidController {

    @Autowired
    private DruidService druidService;

    @RequestMapping(value = "/test")
    public void hello() throws SQLException {
        druidService.select();
    }
}
