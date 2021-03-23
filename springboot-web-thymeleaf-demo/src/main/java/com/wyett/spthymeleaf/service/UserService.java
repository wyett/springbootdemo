package com.wyett.spthymeleaf.service;

import com.wyett.spthymeleaf.entry.User;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/22 18:56
 * @description: TODO
 */

public interface UserService {

    /**
     * get all users
     * @return
     */
    List<User> getAllUsers();

    /**
     * get password by username
     * @param username
     * @return
     */
    String getPasswordByUsername(String username);
}
