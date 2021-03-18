package com.wyett.mongologin.repository;

import com.wyett.mongologin.enteies.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 9:55
 * @description: TODO
 */

public interface UserRepository extends MongoRepository<User, Integer> {
    public List<User> getUserByUsername(String username);
    public User getUserByUsernameAndPassword(String username, String password);
    public User getUserById(int id);
}
