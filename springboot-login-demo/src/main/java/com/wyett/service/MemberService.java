package com.wyett.service;

import com.wyett.common.api.CommonResult;
import com.wyett.common.exception.BusinessException;
import com.wyett.domain.Register;
import com.wyett.domain.UmsMember;

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

    /**
     * login
     * @param username
     * @param password
     * @return
     * @throws BusinessException
     */
    public UmsMember login(String username, String password) throws BusinessException;
}
