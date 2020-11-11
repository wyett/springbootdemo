package com.wyett.loginonecache.service;

import com.wyett.loginonecache.common.exception.BusinessException;
import com.wyett.loginonecache.model.domain.Register;
import com.wyett.loginonecache.model.domain.TokenInfo;
import com.wyett.loginonecache.model.domain.UserInfo;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/10 11:12
 * @description: TODO
 */

public interface MemberService {

    /**
     * register
     * @param register
     * @return
     */
    int registe(Register register) throws BusinessException;


    /**
     * generate token
     * @param userInfo
     * @return
     */
    TokenInfo generateToken(UserInfo userInfo);


    /**
     * login
     * @param username
     * @param password
     * @return
     */
    UserInfo login(String username, String password) throws BusinessException;


    /**
     * logout
     * @param username
     */
    void logout(String username);
}
