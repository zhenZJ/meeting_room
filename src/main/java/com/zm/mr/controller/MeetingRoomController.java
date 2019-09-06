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
import com.zm.mr.model.MeetingRoom;
import com.zm.mr.model.MeetingRoomExample;
import com.zm.mr.model.MeetingRoomExample.Criteria;
import com.zm.mr.service.MeetingRoomService;

/**
 * 会议室管理
 * 
 * @author zhangzhen
 */
@Controller
@RequestMapping("/mr/meetingRoom")
public class MeetingRoomController extends BaseController {

  @Autowired
  private MeetingRoomService meetingRoomService;

  @RequestMapping("/list")
  public String list(PageInfo pageInfo, @DateTimeFormat(pattern = "yyyy-MM-dd") Date minDate, @DateTimeFormat(pattern = "yyyy-MM-dd") Date maxDate,
      String searchParam, ModelMap modelMap) {
    MeetingRoomExample meetingRoomExample = new MeetingRoomExample();
    // 启用假分页 List<MeetingRoom> meetingRoomList =
    // meetingRoomService.selectByPageExmple(meetingRoomExample,
    // pageInfo);
    meetingRoomExample.setOrderByClause("Room_Id desc ");
    Criteria criteria = meetingRoomExample.createCriteria();
    if (minDate != null && maxDate != null) {
      criteria.andCreateTimeBetween(minDate, maxDate);
    } else if (minDate != null) {
      criteria.andCreateTimeGreaterThanOrEqualTo(minDate);
    } else if (maxDate != null) {
      criteria.andCreateTimeLessThanOrEqualTo(maxDate);
    }
    if(StringUtils.isNotBlank(searchParam)) {
      criteria.andRoomNameLike(searchParam);
    }
    List<MeetingRoom> meetingRoomList = meetingRoomService.selectByExample(meetingRoomExample);
    modelMap.addAttribute(meetingRoomList);
    modelMap.addAttribute(pageInfo);
    return "/mr/meetingRoom/list";
  }

  @RequestMapping("/list-view")
  public String listView(PageInfo pageInfo, @DateTimeFormat(pattern = "yyyy-MM-dd") Date minDate,
      @DateTimeFormat(pattern = "yyyy-MM-dd") Date maxDate,
      String searchParam, ModelMap modelMap) {
    MeetingRoomExample meetingRoomExample = new MeetingRoomExample();
    // 启用假分页 List<MeetingRoom> meetingRoomList =
    // meetingRoomService.selectByPageExmple(meetingRoomExample,
    // pageInfo);
    
    meetingRoomExample.setOrderByClause("Room_Id desc ");
    Criteria criteria = meetingRoomExample.createCriteria();
    if (minDate != null && maxDate != null) {
      criteria.andCreateTimeBetween(minDate, maxDate);
    } else if (minDate != null) {
      criteria.andCreateTimeGreaterThanOrEqualTo(minDate);
    } else if (maxDate != null) {
      criteria.andCreateTimeLessThanOrEqualTo(maxDate);
    }
    criteria.andEnabledEqualTo(1);
    if (StringUtils.isNotBlank(searchParam)) {
      criteria.andRoomNameLike(searchParam);
    }
    List<MeetingRoom> meetingRoomList = meetingRoomService.selectByExample(meetingRoomExample);
    modelMap.addAttribute(meetingRoomList);
    modelMap.addAttribute(pageInfo);
    return "/mr/meetingRoom/list-view";
  }

  @RequestMapping("/add")
  public String add() {
    return "/mr/meetingRoom/add";
  }

  @RequestMapping("/addAction")
  @ResponseBody
  public String addAction(MeetingRoom meetingRoom) {
    Date now = new Date();
    meetingRoom.setEnabled(1);
    meetingRoom.setCreateTime(now);
    meetingRoom.setCreateUserId(getUser().getUserId());
    meetingRoom.setUpdateTime(now);
    meetingRoomService.insert(meetingRoom);
    return "success";
  }

  @RequestMapping("/update")
  public String update(Integer roomId, ModelMap modelMap) {
    MeetingRoom meetingRoom = meetingRoomService.selectByPrimaryKey(roomId);
    modelMap.addAttribute(meetingRoom);
    return "/mr/meetingRoom/update";
  }

  @RequestMapping("/detail")
  public String detail(Integer roomId, ModelMap modelMap) {
    MeetingRoom meetingRoom = meetingRoomService.selectByPrimaryKey(roomId);
    modelMap.addAttribute(meetingRoom);
    return "/mr/meetingRoom/detail";
  }

  @RequestMapping("/updateAction")
  @ResponseBody
  public String updateAction(MeetingRoom meetingRoom) {
    Date now = new Date();
    meetingRoom.setUpdateTime(now);
    meetingRoomService.updateByPrimaryKeySelective(meetingRoom);
    return "success";
  }

  @RequestMapping("/deleteAction")
  @ResponseBody
  public Map<String, String> deleteAction(Integer roomId) {
    Map<String, String> resultMap = new HashMap<String, String>();
    meetingRoomService.deleteByPrimaryKey(roomId);
    resultMap.put("success", "true");
    return resultMap;
  }

  @RequestMapping("/enabledAction")
  @ResponseBody
  public Map<String, String> enabledAction(@RequestBody MeetingRoom meetingRoom) {
    Map<String, String> resultMap = new HashMap<String, String>();
    meetingRoomService.updateByPrimaryKeySelective(meetingRoom);
    resultMap.put("success", "true");
    return resultMap;
  }
}
