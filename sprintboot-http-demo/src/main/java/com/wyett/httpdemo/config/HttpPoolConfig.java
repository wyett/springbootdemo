package com.wyett.httpdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/9 11:57
 * @description: TODO
 */

@Component
public class HttpPoolConfig {

    @Value("${http_pool.max_total}")
    private int maxTotal;

    @Value("${http_pool.default_max_per_route}")
    private int maxPerRoute;

    @Value("${http_pool.connect_timeout}")
    private int connTimeout;

    @Value("${http_pool.connection_request_timeout}")
    private int connReqTimeout;

    @Value("${http_pool.socket_timeout}")
    private int socketTimeout;

    @Value("${http_pool.validate_after_inactivity}")
    private int inactivity;

    public int getMaxTotal() {
        return maxTotal;
    }

    public int getMaxPerRoute() {
        return maxPerRoute;
    }

    public int getConnTimeout() {
        return connTimeout;
    }

    public int getConnReqTimeout() {
        return connReqTimeout;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public int getInactivity() {
        return inactivity;
    }
}
