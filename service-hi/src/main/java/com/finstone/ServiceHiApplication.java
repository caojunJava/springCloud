package com.finstone;

import com.finstone.util.SpringContextUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@ComponentScan(basePackages={"com.finstone"})
@MapperScan("com.finstone.mapper")
public class ServiceHiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(ServiceHiApplication.class, args);
		SpringContextUtils.setApplicationContext(applicationContext);
	}
}
