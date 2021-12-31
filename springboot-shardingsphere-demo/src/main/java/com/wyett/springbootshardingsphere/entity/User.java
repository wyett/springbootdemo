package com.wyett.springbootshardingsphere.entity;

import java.io.Serializable;

/**
 * @author : wyettLei
 * @date : Created in 2021/10/12 19:08
 * @description: TODO
 */

public class User implements Serializable {
    private static final long serialVersionUID = -3292336130896563266L;

    /**
     *   `user_id` int(11) NOT NULL AUTO_INCREMENT,
     *   `user_name` varchar(200) DEFAULT NULL,
     *   `user_name_plain` varchar(200) DEFAULT NULL,
     *   `pwd` varchar(200) DEFAULT NULL,
     *   `assisted_query_pwd` varchar(200) DEFAULT NULL,
     */
    private int userId;
    private String userName;
    private String userNamePlain;
    private String pwd;
    private String assistedQueryPwd;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNamePlain() {
        return userNamePlain;
    }

    public void setUserNamePlain(String userNamePlain) {
        this.userNamePlain = userNamePlain;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAssistedQueryPwd() {
        return assistedQueryPwd;
    }

    public void setAssistedQueryPwd(String assistedQueryPwd) {
        this.assistedQueryPwd = assistedQueryPwd;
    }
}
