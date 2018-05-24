package com.finstone.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author caojun
 * @time 2018/1/25 9:25
 * @description  通过@ FeignClient（“服务名”），来指定调用哪个服务
 */
@FeignClient(value = "service-hi",fallback = FeignHystrix.class)
public interface Feign {
    /**
     * 调用了service-hi服务的“/hi”接口
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
