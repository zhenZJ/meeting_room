/** 
 * Project Name:meeting_room 
 * File Name:BaseController.java 
 * Package Name:com.zm.core.base.controller 
 * Date:2019年3月30日下午6:32:12 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.zm.core.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.zm.mr.model.User;

/**
 * @author zhangzhen
 */
public class BaseController {

  /**
   * 获取session中的登录用户的信息
   * 
   * @return
   */
  public User getUser() {
    RequestAttributes ra = RequestContextHolder.getRequestAttributes();
    HttpServletRequest request = ((ServletRequestAttributes) ra).getRequest();
    HttpSession session = request.getSession();
    Object user = session.getAttribute("user");
    if (user != null) { // 未登录
      return (User) user;
    } else { // 已经登录
      return null;
    }
  }

}
