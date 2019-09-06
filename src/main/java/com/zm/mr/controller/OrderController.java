package com.zm.mr.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zm.core.base.controller.BaseController;
import com.zm.mr.model.MeetingRoom;
import com.zm.mr.model.MeetingRoomExample;
import com.zm.mr.model.MeetingRoomOrder;
import com.zm.mr.model.MeetingRoomOrderExample;
import com.zm.mr.service.MeetingRoomOrderService;
import com.zm.mr.service.MeetingRoomService;

/**
 * 会议室预定管理
 * 
 * @author zhangzhen
 */
@Controller
@RequestMapping("/mr/order")
public class OrderController extends BaseController {

  @Autowired
  private MeetingRoomService meetingRoomService;

  @Autowired
  private MeetingRoomOrderService orderService;

  @RequestMapping("/panel")
  public String list(String dType, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, ModelMap modelMap) {

    // 根据选择日期和条件生成展示的日期列表
    List<String> dateList = getDateList(dType, date);
    modelMap.addAttribute("dateList", dateList);

    // 星期显示
    String[] weekName = new String[] { "周一", "周二", "周三", "周四", "周五", "周六", "周日" };
    modelMap.addAttribute("weekName", weekName);

    // 查询有效的会议室
    MeetingRoomExample example = new MeetingRoomExample();
    example.createCriteria().andEnabledEqualTo(1);
    example.setOrderByClause(" ROOM_ID ASC");
    List<MeetingRoom> mrList = meetingRoomService.selectByExample(example);
    modelMap.addAttribute("mrList", mrList);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    if (date != null) {
      modelMap.addAttribute("date", sdf.format(date));
    }

    // 查询所有的会议订单信息
    MeetingRoomOrderExample orderExample = new MeetingRoomOrderExample();
    List<Integer> statusList = new ArrayList<>();
    statusList.add(1);
    statusList.add(2);
    orderExample.createCriteria().andStatusIdIn(statusList);
    List<MeetingRoomOrder> orderList = orderService.selectByExample(orderExample);
    // 按照时间和会议室整理成Map
    Map<String, List<MeetingRoomOrder>> orderMap = new HashMap<String, List<MeetingRoomOrder>>();
    if (!orderList.isEmpty())
      for (MeetingRoomOrder meetingRoomOrder : orderList) {
        String key = meetingRoomOrder.getRoomId() + "_" + sdf.format(meetingRoomOrder.getOrderDate());
        List<MeetingRoomOrder> temp = orderMap.get(key);
        if (temp == null)
          temp = new ArrayList<>();
        temp.add(meetingRoomOrder);
        orderMap.put(key, temp);
      }
    modelMap.addAttribute("orderMap", orderMap);
    return "/mr/order/panel";
  }

  @RequestMapping("/order")
  public String order(int roomId, String orderDate, ModelMap modelMap) {
    MeetingRoom meetingRoom = meetingRoomService.selectByPrimaryKey(roomId);
    modelMap.addAttribute(meetingRoom);
    modelMap.addAttribute("orderDate", orderDate);
    return "/mr/order/order";
  }

  @RequestMapping("/orderAction")
  @ResponseBody
  public Map<String, String> orderAction(MeetingRoomOrder roomOrder) {
    Map<String, String> resultMap = new HashMap<String, String>();
    // 查询当前时间，当前会议室，当前时间段是否有其他人预定
    MeetingRoomOrderExample example = new MeetingRoomOrderExample();
    List<Integer> statusIdList = new ArrayList<>();
    statusIdList.add(1);
    statusIdList.add(2);
    example.createCriteria().andRoomIdEqualTo(roomOrder.getRoomId()).andOrderDateEqualTo(roomOrder.getOrderDate()).andStatusIdIn(statusIdList);
    example.setStartDatePlan(roomOrder.getStarDatePlan());
    example.setEndDatePlan(roomOrder.getEndDatePlan());
    List<MeetingRoomOrder> orderList = orderService.selectByExample(example);
    if (orderList.isEmpty()) {
      Date now = new Date();
      roomOrder.setCreateTime(now);
      roomOrder.setCreateUserId(getUser().getUserId());
      roomOrder.setUpdateTime(now);
      roomOrder.setStatusId(1);
      orderService.insert(roomOrder);
      resultMap.put("success", "true");
    } else {
      resultMap.put("success", "false");
    }
    return resultMap;
  }

  @RequestMapping("/view")
  public String view(int orderId, ModelMap modelMap) {
    MeetingRoomOrder order = orderService.selectByPrimaryKey(orderId);
    modelMap.addAttribute("order", order);
    return "/mr/order/view";
  }

  @RequestMapping("/close")
  public String close(int orderId, ModelMap modelMap) {
    MeetingRoomOrder order = orderService.selectByPrimaryKey(orderId);
    modelMap.addAttribute("order", order);
    return "/mr/order/close";
  }

  @RequestMapping("/closeAction")
  @ResponseBody
  public String closeAction(MeetingRoomOrder roomOrder) {
    Date now = new Date();
    roomOrder.setUpdateTime(now);
    roomOrder.setStatusId(2);
    orderService.updateByPrimaryKeySelective(roomOrder);
    return "success";
  }

  @RequestMapping("/update")
  public String update(int orderId, ModelMap modelMap) {
    MeetingRoomOrder order = orderService.selectByPrimaryKey(orderId);
    modelMap.addAttribute("order", order);
    return "/mr/order/update";
  }

  @RequestMapping("/updateAction")
  @ResponseBody
  public Map<String, String> updateAction(MeetingRoomOrder roomOrder) {
    Map<String, String> resultMap = new HashMap<String, String>();
    // 查询当前时间，当前会议室，当前时间段是否有其他人预定
    List<MeetingRoomOrder> orderList = Collections.emptyList();
    if (roomOrder.getRoomId() != null && roomOrder.getOrderDate() != null) {
      MeetingRoomOrderExample example = new MeetingRoomOrderExample();
      List<Integer> statusIdList = new ArrayList<>();
      statusIdList.add(1);
      statusIdList.add(2);
      example.createCriteria().andRoomIdEqualTo(roomOrder.getRoomId()).andOrderDateEqualTo(roomOrder.getOrderDate())
          .andOrderIdNotEqualTo(roomOrder.getOrderId()).andStatusIdIn(statusIdList);
      example.setStartDatePlan(roomOrder.getStarDatePlan());
      example.setEndDatePlan(roomOrder.getEndDatePlan());
      orderList = orderService.selectByExample(example);
    }
    if (orderList.isEmpty()) {
      Date now = new Date();
      roomOrder.setUpdateTime(now);
      orderService.updateByPrimaryKeySelective(roomOrder);
      resultMap.put("success", "true");
    } else {
      resultMap.put("success", "false");
    }
    return resultMap;
  }

  @RequestMapping("/list")
  public String list(ModelMap modelMap) {
    MeetingRoomOrderExample orderExample = new MeetingRoomOrderExample();
    // 启用假分页 List<User> userList = userService.selectByPageExmple(userExample,
    // pageInfo);
    orderExample.setOrderByClause("order_date asc,star_date_plan asc");
    List<MeetingRoomOrder> orderList = orderService.selectByExample(orderExample);
    modelMap.addAttribute("orderList", orderList);
    return "/mr/order/list";
  }

  @RequestMapping("/list-future")
  public String listFuture(ModelMap modelMap) {
    MeetingRoomOrderExample orderExample = new MeetingRoomOrderExample();
    // 启用假分页 List<User> userList = userService.selectByPageExmple(userExample,
    // pageInfo);
    orderExample.setOrderByClause("order_date asc,star_date_plan asc");
    orderExample.createCriteria().andUserIdEqualTo(getUser().getUserId()).andStatusIdEqualTo(1);
    List<MeetingRoomOrder> orderList = orderService.selectByExample(orderExample);
    modelMap.addAttribute("orderList", orderList);
    return "/mr/order/list_future";
  }

  @RequestMapping("/list-gone")
  public String listGone(ModelMap modelMap) {
    MeetingRoomOrderExample orderExample = new MeetingRoomOrderExample();
    // 启用假分页 List<User> userList = userService.selectByPageExmple(userExample,
    // pageInfo);
    orderExample.setOrderByClause("order_date asc,star_date_plan asc");
    orderExample.createCriteria().andUserIdEqualTo(getUser().getUserId()).andStatusIdNotEqualTo(1);
    List<MeetingRoomOrder> orderList = orderService.selectByExample(orderExample);
    modelMap.addAttribute("orderList", orderList);
    return "/mr/order/list_gone";
  }


  /**
   * @param dType
   * @param date
   * @return
   */
  private List<String> getDateList(String dType, Date date) {
    Calendar calendar = Calendar.getInstance();
    if (date != null) {
      calendar.setTime(date);
    }
    if (dType == null) {
      dType = "2";
    }
    if ("1".equals(dType)) {
      calendar.add(Calendar.DATE, -7);
    } else if ("2".equals(dType)) {
      calendar = Calendar.getInstance();
    } else if ("3".equals(dType)) {
      calendar.add(Calendar.DATE, 7);
    }
    // 基于当前日期计算本周开始时间
    Calendar startCal = calendar;
    int dayofweek = startCal.get(Calendar.DAY_OF_WEEK);
    if (dayofweek == 1) {
      dayofweek += 7;
    }
    startCal.add(Calendar.DATE, 2 - dayofweek);
    Date startDate = startCal.getTime();
    Calendar cal = Calendar.getInstance();
    cal.setTime(startDate);
    cal.add(Calendar.DAY_OF_WEEK, 6);
    Date endDate = cal.getTime();
    List<String> dateList = getDateList(startDate, endDate);
    return dateList;
  }
  public List<String> getDateList(Date startDate, Date endDate) {
    List<String> dateList = Collections.emptyList();
    Calendar beginCd = Calendar.getInstance();
    Calendar endCd = Calendar.getInstance();
    beginCd.setTime(startDate);
    endCd.setTime(endDate);
    dateList = new ArrayList<String>();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    for (;;) {
      if (beginCd.before(endCd)) {
        String date = sdf.format(beginCd.getTime());
        dateList.add(date);
        beginCd.add(Calendar.DATE, 1);
      } else {
        break;
      }
    }
    String endDateStr = sdf.format(endCd.getTime());
    if (!dateList.contains(endDateStr)) {
      dateList.add(endDateStr);
    }
    return dateList;
  }

}
