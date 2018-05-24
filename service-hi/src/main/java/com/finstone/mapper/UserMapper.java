package com.finstone.mapper;

import com.finstone.popj.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author caojun
 * @time 2018/2/24 16:08
 * @description
 */
public interface UserMapper {
    User getUser(String username);
}
