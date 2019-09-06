package com.zm.mr.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zm.core.base.controller.BaseController;
import com.zm.core.base.model.PageInfo;
import com.zm.mr.model.Role;
import com.zm.mr.model.RoleExample;
import com.zm.mr.service.RoleService;

/**
 * 角色管理
 * 
 * @author zhangzhen
 */
@Controller
@RequestMapping("/mr/role")
public class RoleController extends BaseController {

  @Autowired
  private RoleService roleService;

  @RequestMapping("/list")
  public String list(PageInfo pageInfo, ModelMap modelMap) {
    RoleExample roleExample = new RoleExample();
    // 启用假分页 List<Role> roleList = roleService.selectByPageExmple(roleExample,
    // pageInfo);
    roleExample.setOrderByClause("Role_Id asc ");
    List<Role> roleList = roleService.selectByExample(roleExample);
    modelMap.addAttribute(roleList);
    modelMap.addAttribute(pageInfo);
    return "/mr/role/list";
  }

  @RequestMapping("/add")
  public String add() {
    return "/mr/role/add";
  }

  @RequestMapping("/addAction")
  @ResponseBody
  public String addAction(Role role) {
    Date now = new Date();
    role.setCreateTime(now);
    role.setCreateUserId(getUser().getRoleId());
    role.setUpdateTime(now);
    roleService.insert(role);
    return "success";
  }

  @RequestMapping("/update")
  public String update(Integer roleId, ModelMap modelMap) {
    Role role = roleService.selectByPrimaryKey(roleId);
    modelMap.addAttribute(role);
    return "/mr/role/update";
  }

  @RequestMapping("/updateAction")
  @ResponseBody
  public String updateAction(Role role) {
    Date now = new Date();
    role.setUpdateTime(now);
    roleService.updateByPrimaryKeySelective(role);
    return "success";
  }

  @RequestMapping("/deleteAction")
  @ResponseBody
  public Map<String, String> deleteAction(Integer roleId) {
    Map<String, String> resultMap = new HashMap<String, String>();
    roleService.deleteByPrimaryKey(roleId);
    resultMap.put("success", "true");
    return resultMap;
  }

  @RequestMapping("/enabledAction")
  @ResponseBody
  public Map<String, String> enabledAction(@RequestBody Role role) {
    Map<String, String> resultMap = new HashMap<String, String>();
    roleService.updateByPrimaryKeySelective(role);
    resultMap.put("success", "true");
    return resultMap;
  }

  @RequestMapping("/changePwd")
  public String changePwd(Integer roleId, ModelMap modelMap) {
    Role role = roleService.selectByPrimaryKey(roleId);
    modelMap.addAttribute("role", role);
    return "/mr/role/changePwd";
  }

  @RequestMapping("/changePwdAction")
  @ResponseBody
  public Map<String, String> changePwdAction(Role role) {
    Map<String, String> resultMap = new HashMap<String, String>();
    roleService.updateByPrimaryKeySelective(role);
    resultMap.put("success", "true");
    return resultMap;
  }
}
