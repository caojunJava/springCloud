package com.finstone.controller;

import com.finstone.popj.User;
import com.finstone.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${server.port}")
    String port;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam String name){
        return "hi "+name+",i am from port:" +port;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

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
