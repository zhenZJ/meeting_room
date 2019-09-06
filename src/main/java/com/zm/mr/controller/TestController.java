/** 
 * Project Name:meeting_room 
 * File Name:TestContraller.java 
 * Package Name:com.zm.mr.controller 
 * Date:2019年8月10日上午10:21:57 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.zm.mr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zm.mr.model.Role;

/**
 * @author zhangzhen
 */
@Controller
public class TestController {

  @Autowired
  private RedisTemplate redisTemplate;

  @RequestMapping("/test")
  public void test() {
    Role role = new Role();
    role.setRoleId(1);
    role.setRoleName("admin");
    // redisTemplate.opsForValue().set("role_1", role);
    // 同一连接
    SessionCallback callBack = new SessionCallback<Role>() {

      @Override
      public Role execute(RedisOperations operations) throws DataAccessException {
        operations.boundValueOps("role_1").set(role);
        return (Role) operations.boundValueOps("role_1").get();
      }
    };
    // Role role2 = (Role) redisTemplate.opsForValue().get("role_1");
    Role role2 = (Role) redisTemplate.execute(callBack);
    System.out.println(role2.getRoleName());
  }
}
