package com.wyett.spthymeleaf.repository;

import com.wyett.spthymeleaf.entry.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/22 18:53
 * @description: TODO
 */

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select username, password from user_info")
    public List<User> getAllUsers();

    @Query("select username, password from user_info where username=?1")
    public User getUserByUsername(String username);

    @Query("select password from user_info where username=?1")
    public String getPasswordByUsername(String username);
}
