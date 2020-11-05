package com.wyett.redisonecache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/1 17:11
 * @description: TODO
 */

@Controller
@RequestMapping("/cat")
public class TestController {

    @RequestMapping("")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("/index");
        mv.addObject("hi", "hello, cat");
        return mv;
    }
}
