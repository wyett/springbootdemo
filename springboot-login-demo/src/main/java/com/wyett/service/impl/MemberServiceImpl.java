package com.wyett.service.impl;

import com.wyett.common.api.CommonResult;
import com.wyett.common.exception.BusinessException;
import com.wyett.domain.UmsMember;
import com.wyett.domain.UmsMemberExample;
import com.wyett.mapper.UmsMemberMapper;
import com.wyett.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/10 5:05
 * @description: TODO
 */

public class MemberServiceImpl implements MemberService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public CommonResult getOptCode(String telPhone) throws BusinessException {
        // 1.查询用户有没有注册，有则不产生校验码，return
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andPhoneEqualTo(telPhone);
        List<UmsMember> result = umsMemberMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(result)) {
            throw new BusinessException("用户已存在");
        }


        // 2.60秒内避免重复发送校验码


        // 3.生产校验码
        return null;
    }
}
