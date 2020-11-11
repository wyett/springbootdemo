package com.wyett.loginonecache.service.impl;

import com.wyett.loginonecache.common.exception.BusinessException;
import com.wyett.loginonecache.model.domain.Register;
import com.wyett.loginonecache.model.domain.TokenInfo;
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
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.UUID;

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
    public int registe(Register register) throws BusinessException {

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
    public TokenInfo generateToken(UserInfo user) {
        TokenInfo token = new TokenInfo();

        token.setUuid(UUID.randomUUID().toString());
        token.setUsername(user.getUsername());
        return token;
    }


    @Override
    public UserInfo login(String username, String password) throws BusinessException {
        // 1.判断用户和密码非空
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            throw new BusinessException("用户名和密码不能为空");
        }

        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUsernameEqualTo(username).andStatusEqualTo(1);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);


        // 2.判断用户是否存在
        if (CollectionUtils.isEmpty(userInfos)) {
            throw new BusinessException("用户不存在，请注册");
        }

        // 3.重复注册
        if (userInfos.size() > 1) {
            throw new BusinessException("用户名被多次注册，请联系管理员");
        }

        // 4.判断用户名密码是否正确
        UserInfo userInfo = userInfos.get(0);
        if (!passwordEncoder.matches(password, userInfo.getPassword())) {
            throw new BusinessException("密码不正确");
        }


        return userInfo;
    }

    @Override
    public void logout(String username) {
        //

        // 清除缓存

    }
}
