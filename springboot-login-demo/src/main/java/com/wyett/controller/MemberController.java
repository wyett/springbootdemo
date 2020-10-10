package com.wyett.controller;

import com.wyett.common.api.CommonResult;
import com.wyett.common.exception.BusinessException;
import com.wyett.domain.Register;
import com.wyett.domain.UmsMember;
import com.wyett.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/10 4:59
 * @description: TODO
 */

//@RestController
@Controller
@RequestMapping("/sso")
public class MemberController extends HttpController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/getOptCode")
    public CommonResult getOptCode(@RequestParam String telPhone) throws BusinessException {
        String optCode = memberService.getOptCode(telPhone);
        return CommonResult.success(optCode);
    }

    @PostMapping("/register")
    public CommonResult register(@Valid @RequestBody Register register) throws BusinessException {
        int result = memberService.register(register);
        if(result > 0) {
            return CommonResult.success(null);
        }

        return CommonResult.failed();
    }

    @PostMapping("/login")
    public CommonResult login(@RequestParam String username, @RequestParam String password) throws BusinessException {
        UmsMember umsMember = memberService.login(username, password);
        if (umsMember != null) {
            getHttpSession().setAttribute("username", username);
            //getHttpSession().getAttribute("username");
            return CommonResult.success(username + "登录成功");
        }
        return CommonResult.failed();
    }

    @GetMapping("/getOptCode")
    public ModelAndView getOptCode() {
        return new ModelAndView("page/getOptCode");
    }

    @GetMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("page/register");
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("page/login");
    }


}
