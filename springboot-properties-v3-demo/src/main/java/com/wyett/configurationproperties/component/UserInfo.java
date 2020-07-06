package com.wyett.configurationproperties.component;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/6 18:29
 * @description: TODO
 */

@Component
@PropertySource(value = {"classpath:application.properties"})
@ConfigurationProperties(prefix = "userinfo")
public class UserInfo {
    @Setter
    private String name;

    @Setter
    private Integer age;
}
