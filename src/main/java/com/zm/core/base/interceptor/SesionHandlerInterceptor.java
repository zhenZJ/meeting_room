/** 
 * Project Name:meeting_room 
 * File Name:SesionHandlerInterceptor.java 
 * Package Name:com.zm.core.base.interceptor 
 * Date:2019年3月30日下午6:11:04 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.zm.core.base.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户登录信息拦截器，如果用户没有登录，直接跳转到登录页面
 * 
 * @author zhangzhen
 */
public class SesionHandlerInterceptor implements HandlerInterceptor {

  /* (non-Javadoc)
   * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
   */
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    HttpSession session = request.getSession();
    Object user = session.getAttribute("user");
    if (user == null) { // 未登录
      PrintWriter out = response.getWriter();
      StringBuffer sb = new StringBuffer("<script type=\"text/javascript\" charset=\"UTF-8\">");
      sb.append("top.location.href='/logout';");
      sb.append("</script>");
      out.print(sb.toString());
      out.close();
      return false;
    } else { // 已经登录
      return true;
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet
   * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
   * java.lang.Object, org.springframework.web.servlet.ModelAndView)
   */
  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.
   * servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
   * java.lang.Object, java.lang.Exception)
   */
  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

  }

}
