package com.wyett.controller;

import com.wyett.common.api.CommonResult;
import com.wyett.common.exception.BusinessException;
import com.wyett.domain.Register;
import com.wyett.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/10 4:59
 * @description: TODO
 */

@RestController
@RequestMapping("/sso")
public class MemberController {

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
    public CommonResult login(@RequestParam String username, @RequestParam String password) {

        return CommonResult.failed();
    }


}
