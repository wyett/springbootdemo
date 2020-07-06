package com.wyett.valuesample.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/6 18:03
 * @description: TODO
 */

@Component
public class UserInfo {

    @Value("${userinfo.name}")
    private String username;

    @Value("${userinfo.age}")
    private Integer age;

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
