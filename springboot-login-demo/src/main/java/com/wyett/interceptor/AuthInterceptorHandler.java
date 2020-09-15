package com.wyett.interceptor;

import cn.hutool.core.util.ObjectUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wyett.common.api.CommonResult;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/15 10:52
 * @description: TODO
 */

public class AuthInterceptorHandler implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!ObjectUtil.isEmpty(request.getSession().getAttribute("member"))) {
            return true;
        }

        print(response, "没有权限访问，请先登录");
        return false;
    }

    public void print(HttpServletResponse response, String message) throws IOException {
        response.setHeader("ContentType", "application/json");
        response.setCharacterEncoding("UTF-8");
        String result = new ObjectMapper().writeValueAsString(CommonResult.forbidden(message));
        response.getWriter().print(result);

    }
}
