package com.wyett.actuator.indicator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/2/21 16:56
 * @description: TODO
 */

@Component
public class MyHealthIndicator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up()
                .withDetail("app", "app status is ok")
                .withDetail("error", "none");
    }
}
