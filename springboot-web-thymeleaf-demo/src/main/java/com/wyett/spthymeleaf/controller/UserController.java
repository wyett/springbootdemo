package com.wyett.spthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/22 12:06
 * @description: TODO
 */

@Controller
public class UserController {

    @RequestMapping
    public String sayHi() {
        return "hi";
    }

    @RequestMapping(value = "/user")
    public String user(Model model) {
        //ModelAndView mv = new ModelAndView();
        model.addAttribute("name", "wyett");
        model.addAttribute("password", "jumpjump");
        return "user";
    }

}
