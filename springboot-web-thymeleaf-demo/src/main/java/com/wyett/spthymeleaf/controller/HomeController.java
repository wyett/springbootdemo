package com.wyett.spthymeleaf.controller;

import com.wyett.spthymeleaf.entry.User;
import com.wyett.spthymeleaf.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/22 19:22
 * @description: TODO
 */

@Controller
public class HomeController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ModelAndView getAll() {
        ModelAndView mv = new ModelAndView();
        List<User> users = userServiceImpl.getAllUsers();
        mv.addObject("userList", users);
        return mv;
    }
}
