package com.wyett.staticweb.collector;

import cn.hutool.core.util.ObjectUtil;
import com.wyett.staticweb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : wyettLei
 * @date : Created in 2020/8/31 16:24
 * @description: TODO
 */

@Controller
public class IndexController {

    @GetMapping(value = {"", "/"})
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        User user = (User)request.getSession().getAttribute("user");
        if(ObjectUtil.isNull(user)){
            mv.setViewName("redirect:/user/login");
        } else {
            mv.setViewName("page/index");
            mv.addObject(user);
        }

        return mv;
    }
}
