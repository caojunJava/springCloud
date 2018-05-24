package com.finstone.controller;

import com.finstone.popj.User;
import com.finstone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @author caojun
 * @time 2018/1/24 15:53
 * @description
 */
@RestController
@RefreshScope
public class TestController {


    @Autowired
    private UserService userService;



    /**
     * 对外提供接口服务，根据账号查询用户信息
     *
     * @param username
     * @return
     */
    @GetMapping(value = "user/{username}")
    public User getUserByUsername(@PathVariable("username") String username) {
        return this.userService.getUser(username);
    }

}
