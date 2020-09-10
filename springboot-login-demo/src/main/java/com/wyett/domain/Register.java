package com.wyett.domain;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/10 18:34
 * @description: TODO
 */

public class Register {

    @NotBlank(message = "电话号码不允许为空")
    @Length(min = 11, max = 11, message = "电话号码长度必须为11位")
    @Pattern(regexp = "^1[3|5|7|8][0-9]\\d{8}$", message = "电话号码格式不正确")
    private String phone;

    @NotBlank(message = "用户名不允许为空")
    @Length(min = 4, max = 20, message = "用户名长度必须4-20字符之间")
    private String username;

    @NotBlank(message = "校验码不允许为空")
    @Length(min = 6, max = 6, message = "校验码长度必须为6字符")
    private String optCode;

    @NotBlank(message = "密码不允许为空")
    @Length(min = 10, max = 20, message = "密码长度必须8-20字符之间")
    private String password;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOptCode() {
        return optCode;
    }

    public void setOptCode(String optCode) {
        this.optCode = optCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
