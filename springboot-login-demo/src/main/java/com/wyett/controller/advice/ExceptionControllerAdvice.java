package com.wyett.controller.advice;

import com.wyett.common.api.CommonResult;
import com.wyett.common.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author : wyettLei
 * @date : Created in 2020/9/10 17:11
 * @description: handler exception softly
 */

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = Exception.class)
    public CommonResult handlerException(Exception es) {
        if(es instanceof BusinessException) {
            return CommonResult.failed("请稍后再试: " + es.getMessage());
        } else if(es instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException e = (MethodArgumentNotValidException) es;
            return CommonResult.failed("信息验证失败" + e.getBindingResult().getFieldError().getDefaultMessage());
        }
        return CommonResult.failed();
    }
}
