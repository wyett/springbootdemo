package com.wyett.service;

import com.wyett.common.api.CommonResult;
import com.wyett.common.exception.BusinessException;
import com.wyett.domain.Register;

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
    public String getOptCode(String telPhone) throws BusinessException;

    /**
     * user register
     * @param register
     * @return
     */
    public int register(Register register) throws BusinessException;
}
