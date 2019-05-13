package com.aiyou.service.impl;

import com.aiyou.entity.User;
import com.aiyou.mapper.UserMapper;
import com.aiyou.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author abird
 * @date:2019-05-13
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public void regist(User user) {
        userMapper.insert(user);
    }
}
