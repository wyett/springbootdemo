package com.wyett.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/15 11:25
 * @description: TODO
 */

//@RestController
@Slf4j
@Controller
@RequestMapping("/manager")
public class OrderController {

    @GetMapping("/order")
    public ModelAndView order() {
        ModelAndView view = new ModelAndView();

        String order = "order";
        view.setViewName("page/order");
        view.addObject(order);

        return view;
    }
}
