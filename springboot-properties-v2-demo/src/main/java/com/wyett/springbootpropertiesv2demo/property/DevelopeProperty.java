package com.wyett.springbootpropertiesv2demo.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/2/18 0:03
 * @description: TODO
 */

@Data
@ConfigurationProperties(prefix = "develope")
@Component
public class DevelopeProperty {
    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}
