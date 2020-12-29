package com.wyett.loginonecache.controller;

import com.wyett.loginonecache.common.api.BaseModel;
import com.wyett.loginonecache.common.exception.BusinessException;
import com.wyett.loginonecache.model.domain.Register;
import com.wyett.loginonecache.model.domain.TokenInfo;
import com.wyett.loginonecache.model.domain.UserInfo;
import com.wyett.loginonecache.service.MemberService;
import com.wyett.loginonecache.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/10 10:38
 * @description: TODO
 */

@RestController("v1")
public class MemberController extends HttpController {

    public static final long EXPIRE_TIME = 60;

    @Autowired
    private RedisService redisService;

    @Autowired
    private MemberService memberService;



    // 注册
    @PostMapping("/registe")
    public BaseModel registe(@RequestParam Register register) throws BusinessException {
        int result = memberService.registe(register);
        return BaseModel.getInstance(result);
    }


    // 登录
    @PostMapping("/login")
    public BaseModel login(@RequestParam String username, @RequestParam String password) throws BusinessException {
        UserInfo userInfo = memberService.login(username, password);
        if (userInfo != null) {
            TokenInfo token = memberService.generateToken(userInfo);
            //HttpSession session = new HttpSession();
            getHttpSession().setAttribute("member", token);
            redisService.set(token.toString(), getHttpSession().getId());
            redisService.expire(token.toString(), EXPIRE_TIME, TimeUnit.SECONDS);

            //return userInfo;
        }

        return BaseModel.getInstance("success");

    }


    // 登出
}
