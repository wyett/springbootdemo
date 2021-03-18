package com.wyett.mongologin.controller;

import com.wyett.mongologin.enteies.User;
import com.wyett.mongologin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 10:14
 * @description: TODO
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/addUser")
    @ResponseBody
    public Integer addUser() {
        userRepository.deleteAll();
        User user = new User();
        for(int i=0; i < 100; i++) {
            user.setId(i);
            user.setUsername("username" + i);
            user.setPassword("password" + i);
            userRepository.save(user);
        }
        return 100;
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAllUser() {
        List<User> listUser = userRepository.findAll();
        return listUser;
    }

    @RequestMapping("/getUserById/{id}")
    @ResponseBody
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }
}
