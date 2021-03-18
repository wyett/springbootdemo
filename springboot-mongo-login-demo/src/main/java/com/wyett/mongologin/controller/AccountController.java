package com.wyett.mongologin.controller;

import com.wyett.mongologin.enteies.User;
import com.wyett.mongologin.services.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 10:22
 * @description: TODO
 */

@Slf4j
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public String login() {
        return "account/login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(String username, String password, HttpServletRequest rq, HttpServletResponse rp) {
        ModelAndView mv = new ModelAndView("redirect:/home/index");
        try {
            User user = userServiceImpl.getUserByNameAndPassword(username, password);
            if (user != null) {
                rq.getSession().setAttribute("username", username);
            }else {
                mv.setViewName("redirct:./login");
            }
        } catch (Exception e) {
            log.debug("login error");
        }
        return mv;
    }
}
