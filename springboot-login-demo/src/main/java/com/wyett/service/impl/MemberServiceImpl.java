package com.wyett.service.impl;

import com.wyett.common.api.CommonResult;
import com.wyett.common.exception.BusinessException;
import com.wyett.config.properties.RedisKeyPrefixConfig;
import com.wyett.domain.Register;
import com.wyett.domain.UmsMember;
import com.wyett.domain.UmsMemberExample;
import com.wyett.mapper.UmsMemberMapper;
import com.wyett.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/10 5:05
 * @description: TODO
 */

@Slf4j
@EnableConfigurationProperties(value = RedisKeyPrefixConfig.class)
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisKeyPrefixConfig redisKeyPrefixConfig;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String getOptCode(String telPhone) throws BusinessException {
        // 1.查询用户有没有注册，有则不产生校验码，return
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andPhoneEqualTo(telPhone);
        List<UmsMember> result = umsMemberMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(result)) {
            throw new BusinessException("用户已存在");
        }


        // 2.60秒内避免重复发送校验码
        if(redisTemplate.hasKey(redisKeyPrefixConfig.getPrefix().getOtpCode() + telPhone)) {
            throw new BusinessException("请60s后尝试");
        }


        // 3.生产校验码
        Random random = new Random();
        StringBuilder stb = new StringBuilder();

        for (int i=0; i< 6; i++) {
            stb.append(random.nextInt(10));
        }

        log.info("getOptCode: " + stb.toString());
        redisTemplate.opsForValue().set(redisKeyPrefixConfig.getPrefix().getOtpCode() + telPhone,
                stb.toString(), redisKeyPrefixConfig.getExpire().getOtpCode(), TimeUnit.SECONDS);

        return stb.toString();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int register(Register register) throws BusinessException {

        // 1.从缓存中获取验证码
        String optCode = (String)redisTemplate.opsForValue().
                        get(redisKeyPrefixConfig.getPrefix().getOtpCode() + register.getPhone());

        if(StringUtils.isEmpty(optCode) || !optCode.equals(register.getOptCode())) {
            throw new BusinessException("验证码不正确！");
        }

        UmsMember umsMember = new UmsMember();
        umsMember.setMemberLevelId(4L);
        umsMember.setStatus(1);
        BeanUtils.copyProperties(register, umsMember);
        umsMember.setPassword(passwordEncoder.encode(register.getPassword()));

        return umsMemberMapper.insertSelective(umsMember);
    }

    @Override
    public UmsMember login(String username, String password) throws BusinessException {
        UmsMemberExample memberExample = new UmsMemberExample();
        memberExample.createCriteria().andUsernameEqualTo(username).andStatusEqualTo(1);
        List<UmsMember> result = umsMemberMapper.selectByExample(memberExample);

        if (CollectionUtils.isEmpty(result)) {
            throw new BusinessException("用户名或者密码不正确");
        }
        if (result.size() > 1) {
            throw new BusinessException("用户被重复注册，请联系客服");
        }
        UmsMember umsMember = result.get(0);
        if (!passwordEncoder.matches(password, umsMember.getPassword())) {
            throw new BusinessException("用户密码不正确");
        }
        return umsMember;
    }
}















