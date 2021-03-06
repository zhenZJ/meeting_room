/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.dao;

import org.springframework.stereotype.Repository;

import com.zm.core.base.dao.BaseMapper;
import com.zm.mr.model.User;
import com.zm.mr.model.UserExample;

@Repository("userMapper")
public interface UserMapper extends BaseMapper<User, UserExample, Integer> {
}