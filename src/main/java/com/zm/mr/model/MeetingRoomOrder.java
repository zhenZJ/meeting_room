/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * t_meeting_room_order
 * <p/>
 * 
 * @date Sat Mar 30 21:54:26 CST 2019
 *
 */
/**
 * @author zhangzhen
 */
@SuppressWarnings("serial")
public class MeetingRoomOrder implements Serializable {
  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  private Integer orderId;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  private String orderNo;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  private Integer userId;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  private Integer roomId;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date orderDate;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  private String description;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  @DateTimeFormat(pattern = "HH:mm")
  private Date starDatePlan;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  @DateTimeFormat(pattern = "HH:mm")
  private Date endDatePlan;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  @DateTimeFormat(pattern = "HH:mm")
  private Date starDateActual;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  @DateTimeFormat(pattern = "HH:mm")
  private Date endDateActual;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  private Integer statusId;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  private String remark;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  private Integer createUserId;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  private Date createTime;

  /**
   * 
   * @author
   * @date Sat Mar 30 21:54:26 CST 2019
   * @return
   */
  private Date updateTime;

  private User user;

  private MeetingRoom room;

  /**
   * @return null :
   */
  public Integer getOrderId() {
    return orderId;
  }

  /**
   * @param orderId
   *          :
   */
  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  /**
   * @return null :
   */
  public String getOrderNo() {
    return orderNo;
  }

  /**
   * @param orderNo
   *          :
   */
  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo == null ? null : orderNo.trim();
  }

  /**
   * @return null :
   */
  public Integer getUserId() {
    return userId;
  }

  /**
   * @param userId
   *          :
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * @return null :
   */
  public Integer getRoomId() {
    return roomId;
  }

  /**
   * @param roomId
   *          :
   */
  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  /**
   * @return null :
   */
  public Date getOrderDate() {
    return orderDate;
  }

  /**
   * @param orderDate
   *          :
   */
  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  /**
   * @return null :
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description
   *          :
   */
  public void setDescription(String description) {
    this.description = description == null ? null : description.trim();
  }

  /**
   * @return null :
   */
  public Date getStarDatePlan() {
    return starDatePlan;
  }

  /**
   * @param starDatePlan
   *          :
   */
  public void setStarDatePlan(Date starDatePlan) {
    this.starDatePlan = starDatePlan;
  }

  /**
   * @return null :
   */
  public Date getEndDatePlan() {
    return endDatePlan;
  }

  /**
   * @param endDatePlan
   *          :
   */
  public void setEndDatePlan(Date endDatePlan) {
    this.endDatePlan = endDatePlan;
  }

  /**
   * @return null :
   */
  public Date getStarDateActual() {
    return starDateActual;
  }

  /**
   * @param starDateActual
   *          :
   */
  public void setStarDateActual(Date starDateActual) {
    this.starDateActual = starDateActual;
  }

  /**
   * @return null :
   */
  public Date getEndDateActual() {
    return endDateActual;
  }

  /**
   * @param endDateActual
   *          :
   */
  public void setEndDateActual(Date endDateActual) {
    this.endDateActual = endDateActual;
  }

  /**
   * @return null :
   */
  public Integer getStatusId() {
    return statusId;
  }

  /**
   * @param statusId
   *          :
   */
  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }

  /**
   * @return null :
   */
  public String getRemark() {
    return remark;
  }

  /**
   * @param remark
   *          :
   */
  public void setRemark(String remark) {
    this.remark = remark == null ? null : remark.trim();
  }

  /**
   * @return null :
   */
  public Integer getCreateUserId() {
    return createUserId;
  }

  /**
   * @param createUserId
   *          :
   */
  public void setCreateUserId(Integer createUserId) {
    this.createUserId = createUserId;
  }

  /**
   * @return null :
   */
  public Date getCreateTime() {
    return createTime;
  }

  /**
   * @param createTime
   *          :
   */
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  /**
   * @return null :
   */
  public Date getUpdateTime() {
    return updateTime;
  }

  /**
   * @param updateTime
   *          :
   */
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  /**
   * @return the user
   */
  public User getUser() {
    return user;
  }

  /**
   * @param user
   *          the user to set
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * @return the room
   */
  public MeetingRoom getRoom() {
    return room;
  }

  /**
   * @param room
   *          the room to set
   */
  public void setRoom(MeetingRoom room) {
    this.room = room;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", orderId=").append(orderId);
    sb.append(", orderNo=").append(orderNo);
    sb.append(", userId=").append(userId);
    sb.append(", user=").append(user);
    sb.append(", roomId=").append(roomId);
    sb.append(", room=").append(room);
    sb.append(", orderDate=").append(orderDate);
    sb.append(", description=").append(description);
    sb.append(", starDatePlan=").append(starDatePlan);
    sb.append(", endDatePlan=").append(endDatePlan);
    sb.append(", starDateActual=").append(starDateActual);
    sb.append(", endDateActual=").append(endDateActual);
    sb.append(", statusId=").append(statusId);
    sb.append(", remark=").append(remark);
    sb.append(", createUserId=").append(createUserId);
    sb.append(", createTime=").append(createTime);
    sb.append(", updateTime=").append(updateTime);
    sb.append("]");
    return sb.toString();
  }
}