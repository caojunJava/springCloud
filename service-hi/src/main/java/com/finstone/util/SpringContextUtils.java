package com.finstone.util;

import org.springframework.context.ApplicationContext;

/**
 * @author caojun
 * @time 2018/2/24 14:09
 * @description
 */
public class SpringContextUtils {

    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    public static Object getBean(String beanId) {
        return applicationContext.getBean(beanId);
    }
}
