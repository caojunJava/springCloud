package com.finstone.controller;

import com.finstone.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caojun
 * @time 2018/1/24 15:59
 * @description
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return testService.hiService(name);
    }
}
