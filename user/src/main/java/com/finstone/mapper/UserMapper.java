package com.finstone.mapper;

import com.finstone.popj.User;

/**
 * @author caojun
 * @time 2018/2/24 16:43
 * @description
 */

public interface UserMapper {

    User getUser(String username);
}
