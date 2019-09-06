/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.service.impl;

import com.zm.core.base.service.impl.BaseServiceImpl;
import com.zm.mr.dao.UserMapper;
import com.zm.mr.model.User;
import com.zm.mr.model.UserExample;
import com.zm.mr.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserExample, Integer> implements UserService {
    
    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    public UserMapper userMapper;

    @Autowired
    public void setMapper() {
        super.setMapper(userMapper);
    }
}