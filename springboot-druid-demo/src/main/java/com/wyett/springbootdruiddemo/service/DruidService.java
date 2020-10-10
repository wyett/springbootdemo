package com.wyett.springbootdruiddemo.service;

import com.wyett.springbootdruiddemo.config.DruidConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * @author : wyettLei
 * @date : Created in 2020/10/9 17:09
 * @description: TODO
 */

public interface DruidService {

    /**
     * select method
     */
    public void select() throws SQLException;
}
