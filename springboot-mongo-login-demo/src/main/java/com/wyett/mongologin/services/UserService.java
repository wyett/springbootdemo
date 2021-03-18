package com.wyett.mongologin.services;

import com.wyett.mongologin.enteies.User;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 9:57
 * @description: TODO
 */

public interface UserService {

    /**
     * get user by id
     * @param id
     * @return
     */
    User getUserById(int id);


    /**
     * get user by name and password
     * @param username
     * @param password
     * @return
     */
    User getUserByNameAndPassword(String username, String password);
}
