package com.wyett.springbootdruiddemo.service.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.wyett.springbootdruiddemo.service.DruidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author : wyettLei
 * @date : Created in 2020/10/9 17:18
 * @description: TODO
 */

@Service
public class DruidServiceImpl implements DruidService {

    @Autowired
    private DruidDataSource druidDataSource;

    @Override
    public void select() throws SQLException {
        Connection connection = druidDataSource.getConnection();
        System.out.println("connecting...");
        System.out.println("当前连接数:" + druidDataSource.getConnectCount());
        System.out.println("当前关闭连接数:" + druidDataSource.getCloseCount());

        //connection.close();
    }
}
