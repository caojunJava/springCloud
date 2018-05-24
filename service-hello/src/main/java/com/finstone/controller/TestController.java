package com.finstone.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caojun
 * @time 2018/1/24 15:53
 * @description
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/hello")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam String name){
        return "hi "+name+",i am from port:" +port;
    }

    public String hiError(String name) {
        return "hello,"+name+",sorry,error!";
    }

}
