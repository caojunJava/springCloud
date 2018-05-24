package com.finstone.controller;

import com.finstone.service.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caojun
 * @time 2018/1/25 9:28
 * @description
 */

@RestController
public class FeignController {

    @Autowired
    private Feign feign;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return feign.sayHiFromClientOne(name);
    }
}
