package com.finstone.service;

import org.springframework.stereotype.Component;

/**
 * @author caojun
 * @time 2018/1/25 10:04
 * @description
 */
@Component
public class FeignHystrix implements Feign{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
