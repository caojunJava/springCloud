package com.finstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caojun
 * @time 2018/1/24 15:53
 * @description
 */
@RestController
public class TestController {



    /**
     * 对外提供接口服务，根据账号查询用户信息
     *
     * @param username
     * @return
     */
    @GetMapping(value = "user/{username}")
    public String getUserByUsername(@PathVariable("username") String username) {
        return username;
    }

}
