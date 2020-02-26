package com.wyett.springbootpropertiesv2demo.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/2/18 0:11
 * @description: TODO
 */

@Data
@Component
public class ApplicationProperty {
    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;
}
