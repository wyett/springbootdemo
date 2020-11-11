package com.wyett.loginonecache.model.domain;

import java.util.UUID;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/11 15:05
 * @description: TODO
 */

public class TokenInfo {

    private String uuid;

    private String username;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "TokenInfo{" +
                "uuid='" + uuid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
