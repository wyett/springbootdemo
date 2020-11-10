package com.wyett.loginonecache.common.exception;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/10 11:39
 * @description: TODO
 */

public class BusinessException extends Exception {

    public BusinessException() {super();}

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
