package com.zm.mr.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.zm.core.base.controller.BaseController;
import com.zm.mr.model.User;
import com.zm.mr.model.UserExample;
import com.zm.mr.service.UserService;

/**
 * 登录
 * 
 * @author zhangzhen
 */
@Controller
@SessionAttributes("user")
public class LoginController extends BaseController {

  @Autowired
  private UserService userSerive;

  @RequestMapping("/")
  public String index() {
    return "redirect:/logout";
  }

  @RequestMapping("/main")
  public String main() {
    return "/main";
  }

  @RequestMapping("/login")
  public String login(User user, ModelMap modelMap) {
    UserExample userExample = new UserExample();
    userExample.createCriteria().andUserAccountEqualTo(user.getUserAccount()).andEnabledEqualTo(1);
    User dbUser = userSerive.selectByCondition(userExample);
    if (dbUser != null && dbUser.getUserPwd().equals(user.getUserPwd())) {
      modelMap.addAttribute("user", dbUser);
      return "redirect:/main";
    } else {
      modelMap.addAttribute("userAccount", user.getUserAccount());
      modelMap.addAttribute("errorMessage", "用户名或者密码不正确！");
      return "/index";
    }
  }

  @RequestMapping("/logout")
  public String logout(HttpSession session, SessionStatus sessionStatus) {
    session.invalidate();
    sessionStatus.setComplete();
    return "/index";
  }
}
