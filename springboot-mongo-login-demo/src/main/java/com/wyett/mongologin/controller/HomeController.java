package com.wyett.mongologin.controller;

import com.wyett.mongologin.enteies.User;
import com.wyett.mongologin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 10:22
 * @description: TODO
 */

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
