package com.finstone.service;

import com.finstone.mapper.UserMapper;
import com.finstone.popj.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caojun
 * @time 2018/2/24 13:58
 * @description
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String usrname){
        return userMapper.getUser(usrname);
    }

}
