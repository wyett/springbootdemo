package com.wyett.mongologin.services.impl;

import com.wyett.mongologin.enteies.User;
import com.wyett.mongologin.repository.UserRepository;
import com.wyett.mongologin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 10:08
 * @description: TODO
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(int id) {
        return id <= 0 ? null:userRepository.getUserById(id);
    }

    @Override
    public User getUserByNameAndPassword(String username, String password) {
        return userRepository.getUserByUsernameAndPassword(username, password);
    }
}
