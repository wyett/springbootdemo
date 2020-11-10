package com.wyett.loginonecache.service;

import com.wyett.loginonecache.common.exception.BusinessException;
import com.wyett.loginonecache.dao.User;
import com.wyett.loginonecache.model.domain.Register;

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
    int register(Register register) throws BusinessException;


    /**
     * generate token
     * @param user
     * @return
     */
    String generateToken(User user);


    /**
     * login
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);


    /**
     * logout
     * @param username
     */
    void logout(String username);
}
