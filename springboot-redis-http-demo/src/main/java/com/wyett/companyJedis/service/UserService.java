package com.wyett.companyJedis.service;

import com.wyett.companyJedis.entry.User;

/**
 * @author : wyettLei
 * @date : Created in 2021/3/18 15:09
 * @description: TODO
 */

public interface UserService {

    User getValueByKey(String key);

    void save(String key, User v);
}
