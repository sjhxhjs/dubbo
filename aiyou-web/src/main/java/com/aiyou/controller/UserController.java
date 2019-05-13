package com.aiyou.controller;

import com.aiyou.domain.Result;
import com.aiyou.entity.User;
import com.aiyou.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abird
 * @date:2019-05-13
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public Result regist(@RequestBody User user) {
        try {
            userService.regist(user);
            return new Result(true, "注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "注册失败");
        }
    }
}
