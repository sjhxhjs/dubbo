package com.aiyou.service;

import com.aiyou.entity.User;

import java.util.List;

/**
 * @author abird
 * @date:2019-05-13
 * @Description:用户注册
 */
public interface UserService {
    public void regist(User user);

    public List<User> getUserInfo();

    public List<User> getUserInfoByName(String username);
}
