package com.wyett.service;

import com.wyett.common.api.CommonResult;
import com.wyett.common.exception.BusinessException;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/10 5:03
 * @description: TODO
 */

public interface MemberService {

    /**
     * return otpcode
     * @param telPhone
     * @return
     */
    public CommonResult getOptCode(String telPhone) throws BusinessException;
}
