package com.wyett.configurationproperties.controller;

import com.wyett.configurationproperties.component.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/6 18:34
 * @description: TODO
 */

@RestController
public class UserController {
    @Autowired
    private UserInfo userInfo;

    @RequestMapping
    public String getUserInfo() {
        return userInfo.toString();
    }

}
