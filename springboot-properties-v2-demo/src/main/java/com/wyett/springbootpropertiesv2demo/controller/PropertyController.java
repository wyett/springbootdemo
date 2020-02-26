package com.wyett.springbootpropertiesv2demo.controller;

import cn.hutool.core.lang.Dict;
import com.wyett.springbootpropertiesv2demo.property.ApplicationProperty;
import com.wyett.springbootpropertiesv2demo.property.DevelopeProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wyettLei
 * @date : Created in 2020/2/18 0:15
 * @description: TODO
 */

@RestController
public class PropertyController {
    private final ApplicationProperty applicationProperty;
    private final DevelopeProperty developeProperty;

    public PropertyController(ApplicationProperty applicationProperty, DevelopeProperty developeProperty) {
        this.applicationProperty = applicationProperty;
        this.developeProperty = developeProperty;
    }

    @RequestMapping("/property")
    public Dict index() {
        return Dict.create().set("applicationProperty", applicationProperty)
                .set("developeProperty", developeProperty);
    }
}
