package com.wyett.mongologin.enteies;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 9:47
 * @description: TODO
 */

@Document(collection = "userinfo")
public class User {
    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
