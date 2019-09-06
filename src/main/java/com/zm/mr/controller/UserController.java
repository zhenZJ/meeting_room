package com.zm.mr.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zm.core.base.controller.BaseController;
import com.zm.core.base.model.PageInfo;
import com.zm.mr.model.Role;
import com.zm.mr.model.RoleExample;
import com.zm.mr.model.User;
import com.zm.mr.model.UserExample;
import com.zm.mr.model.UserExample.Criteria;
import com.zm.mr.service.RoleService;
import com.zm.mr.service.UserService;

/**
 * 用户管理
 * 
 * @author zhangzhen
 */
@Controller
@RequestMapping("/mr/user")
public class UserController extends BaseController {

  @Autowired
  private UserService userService;

  @Autowired
  private RoleService roleService;

  @RequestMapping("/list")
  public String list(PageInfo pageInfo, @DateTimeFormat(pattern = "yyyy-MM-dd") Date minDate, @DateTimeFormat(pattern = "yyyy-MM-dd") Date maxDate,
      String searchParam, ModelMap modelMap) {
    UserExample userExample = new UserExample();
    // 启用假分页 List<User> userList = userService.selectByPageExmple(userExample,
    // pageInfo);
    userExample.setOrderByClause("User_Id desc ");
    Criteria criteria = userExample.createCriteria();
    if (minDate != null && maxDate != null) {
      criteria.andCreateTimeBetween(minDate, maxDate);
    } else if (minDate != null) {
      criteria.andCreateTimeGreaterThanOrEqualTo(minDate);
    } else if (maxDate != null) {
      criteria.andCreateTimeLessThanOrEqualTo(maxDate);
    }
    if(StringUtils.isNotBlank(searchParam)) {
      criteria.andUserNameLike(searchParam);
    }
    List<User> userList = userService.selectByExample(userExample);
    modelMap.addAttribute(userList);
    modelMap.addAttribute(pageInfo);
    return "/mr/user/list";
  }

  @RequestMapping("/add")
  public String add(ModelMap modelMap) {
    // 查询系统角色信息
    RoleExample roleExample = new RoleExample();
    roleExample.createCriteria().andEnabledEqualTo(1);
    List<Role> roleList = roleService.selectByExample(roleExample);
    modelMap.addAttribute(roleList);
    return "/mr/user/add";
  }

  @RequestMapping("/addAction")
  @ResponseBody
  public Map<String, String> addAction(User user) {
    Map<String, String> resultMap = new HashMap<String, String>();
    // 查询账户
    UserExample example = new UserExample();
    example.createCriteria().andUserAccountEqualTo(user.getUserAccount());
    List<User> userList = userService.selectByExample(example);
    if (userList.isEmpty()) {
      Date now = new Date();
      user.setEnabled(1);
      user.setCreateTime(now);
      user.setCreateUserid(getUser().getUserId());
      user.setUpdateTime(now);
      userService.insert(user);
      resultMap.put("success", "true");
    } else {
      resultMap.put("success", "false");
    }
    return resultMap;
  }

  @RequestMapping("/update")
  public String update(Integer userId, ModelMap modelMap) {
    User user = userService.selectByPrimaryKey(userId);
    modelMap.addAttribute(user);

    // 查询系统角色信息
    RoleExample roleExample = new RoleExample();
    roleExample.createCriteria().andEnabledEqualTo(1);
    List<Role> roleList = roleService.selectByExample(roleExample);
    modelMap.addAttribute(roleList);
    return "/mr/user/update";
  }

  @RequestMapping("/detail")
  public String detail(Integer userId, ModelMap modelMap) {
    User user = userService.selectByPrimaryKey(userId);
    modelMap.addAttribute(user);
    return "/mr/user/detail";
  }

  @RequestMapping("/updateAction")
  @ResponseBody
  public Map<String, String> updateAction(User user) {
    Map<String, String> resultMap = new HashMap<String, String>();
    // 查询账户
    UserExample example = new UserExample();
    example.createCriteria().andUserAccountEqualTo(user.getUserAccount()).andUserIdNotEqualTo(user.getUserId());
    List<User> userList = userService.selectByExample(example);
    if (userList.isEmpty()) {
      Date now = new Date();
      user.setUpdateTime(now);
      userService.updateByPrimaryKeySelective(user);
      resultMap.put("success", "true");
    } else {
      resultMap.put("success", "false");
    }
    return resultMap;
  }

  @RequestMapping("/deleteAction")
  @ResponseBody
  public Map<String, String> deleteAction(Integer userId) {
    Map<String, String> resultMap = new HashMap<String, String>();
    userService.deleteByPrimaryKey(userId);
    resultMap.put("success", "true");
    return resultMap;
  }

  @RequestMapping("/enabledAction")
  @ResponseBody
  public Map<String, String> enabledAction(@RequestBody User user) {
    Map<String, String> resultMap = new HashMap<String, String>();
    userService.updateByPrimaryKeySelective(user);
    resultMap.put("success", "true");
    return resultMap;
  }

  @RequestMapping("/changePwd")
  public String changePwd(Integer userId,ModelMap modelMap) {
    User user = userService.selectByPrimaryKey(userId);
    modelMap.addAttribute("user", user);
    return "/mr/user/changePwd";
  }

  @RequestMapping("/changePwdAction")
  @ResponseBody
  public Map<String, String> changePwdAction(User user) {
    Map<String, String> resultMap = new HashMap<String, String>();
    userService.updateByPrimaryKeySelective(user);
    resultMap.put("success", "true");
    return resultMap;
  }
}
