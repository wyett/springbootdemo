package com.wyett.spthymeleaf.service.impl;

import com.wyett.spthymeleaf.entry.User;
import com.wyett.spthymeleaf.repository.UserRepository;
import com.wyett.spthymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/22 18:58
 * @description: TODO
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.getAllUsers();
        return users;
    }

    @Override
    public String getPasswordByUsername(String username) {
        return username.length() > 0 ? userRepository.getPasswordByUsername(username) : null;
    }
}
