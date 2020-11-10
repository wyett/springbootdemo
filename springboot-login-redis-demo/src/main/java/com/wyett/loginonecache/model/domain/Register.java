package com.wyett.loginonecache.model.domain;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/10 17:17
 * @description: TODO
 */

public class Register {

    @NotBlank(message = "用户名不允许为空")
    @Length(min = 4, max = 20, message = "用户名长度必须4-20字符之间")
    private String username;

    @NotBlank(message = "密码不允许为空")
    @Length(min = 8, max = 20, message = "密码长度必须8-20字符之间")
    private String password;

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

    @Override
    public String toString() {
        return "Register{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
