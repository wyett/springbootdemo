package com.wyett.staticweb.collector;

import com.wyett.staticweb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : wyettLei
 * @date : Created in 2020/8/31 16:22
 * @description: TODO
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject(user);
        modelAndView.setViewName("redirect:/");

        request.getSession().setAttribute("user", user);
        return modelAndView;

    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("page/login");

    }
}
