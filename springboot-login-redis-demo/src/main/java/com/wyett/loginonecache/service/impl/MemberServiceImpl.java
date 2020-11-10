package com.wyett.loginonecache.service.impl;

import com.github.pagehelper.util.StringUtil;
import com.wyett.loginonecache.common.exception.BusinessException;
import com.wyett.loginonecache.dao.User;
import com.wyett.loginonecache.model.domain.Register;
import com.wyett.loginonecache.model.domain.UserInfo;
import com.wyett.loginonecache.model.domain.UserInfoExample;
import com.wyett.loginonecache.model.mapper.UserInfoMapper;
import com.wyett.loginonecache.service.MemberService;
import com.wyett.loginonecache.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/10 11:16
 * @description: TODO
 */

@Slf4j
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private RedisService redisService;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;



    @Override
    public int register(Register register) throws BusinessException {

        // 1.判断用户是否存在
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUsernameEqualTo(register.getUsername());
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        if (!CollectionUtils.isEmpty(userInfos)) {
            throw new BusinessException("用户已存在");
        }

        // 2.加密并insert
        UserInfo userInfo = new UserInfo();
        userInfo.setStatus(1);
        BeanUtils.copyProperties(register, userInfo);
        userInfo.setPassword(passwordEncoder.encode(register.getPassword()));

        return userInfoMapper.insertSelective(userInfo);

    }

    @Override
    public String generateToken(User user) {
        return null;
    }

    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public void logout(String username) {

    }
}
