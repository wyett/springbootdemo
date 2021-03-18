package com.wyett.companyJedis.entry;

import java.io.Serializable;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 14:29
 * @description: TODO
 */



public class User implements Serializable {


    private static final long serialVersionUID = 6087823377202812852L;

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
