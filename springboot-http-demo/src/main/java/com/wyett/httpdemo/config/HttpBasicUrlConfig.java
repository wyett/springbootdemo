package com.wyett.httpdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/9 18:47
 * @description: TODO
 */

@Component
public class HttpBasicUrlConfig {

    @Value("${http_url.basic_str}")
    private String domain;


    @Value("${http_url.port}")
    private int port;

    public String getDomain() {
        return domain;
    }

    public int getPort() {
        return port;
    }


}
