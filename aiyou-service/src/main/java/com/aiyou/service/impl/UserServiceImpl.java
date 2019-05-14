package com.aiyou.service.impl;

import com.aiyou.entity.User;
import com.aiyou.mapper.UserMapper;
import com.aiyou.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    public List<User> getUserInfo() {
        PageHelper.startPage(1, 10);
        List<User> list = userMapper.getUserInfo();
        return list;
    }

    public List<User> getUserInfoByName(String username) {
        PageHelper.startPage(1, 10);
        List<User> list = userMapper.getUserInfoByname(username);
        return list;
    }
}
