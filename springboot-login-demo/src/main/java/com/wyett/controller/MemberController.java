package com.wyett.controller;

import com.wyett.common.api.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/10 4:59
 * @description: TODO
 */

@RestController
@RequestMapping("/sso")
public class MemberController {

    @PostMapping("/getOptCode")
    public CommonResult getOptCode(@RequestParam String telPhone) {

        return null;
    }
}
