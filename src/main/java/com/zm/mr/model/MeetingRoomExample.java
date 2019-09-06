/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zm.core.base.model.BaseExample;

@SuppressWarnings("serial")
public class MeetingRoomExample extends BaseExample implements Serializable {
  /**
   * @date Fri Apr 05 12:36:01 CST 2019
   */
  protected String orderByClause;

  /**
   * @date Fri Apr 05 12:36:01 CST 2019
   */
  protected boolean distinct;

  /**
   * @date Fri Apr 05 12:36:01 CST 2019
   */
  protected List<Criteria> oredCriteria;


  public MeetingRoomExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  public String getOrderByClause() {
    return orderByClause;
  }

  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  public boolean isDistinct() {
    return distinct;
  }

  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * MeetingRoom
   * <p/>
   * t_meeting_room
   * 
   * @date Fri Apr 05 12:36:01 CST 2019
   */
  protected abstract static class GeneratedCriteria {
    protected List<Criterion> criteria;

    protected GeneratedCriteria() {
      super();
      criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
      return criteria.size() > 0;
    }

    public List<Criterion> getAllCriteria() {
      return criteria;
    }

    public List<Criterion> getCriteria() {
      return criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      criteria.add(new Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value1, value2));
    }

    public Criteria andRoomIdIsNull() {
      addCriterion("Room_Id is null");
      return (Criteria) this;
    }

    public Criteria andRoomIdIsNotNull() {
      addCriterion("Room_Id is not null");
      return (Criteria) this;
    }

    public Criteria andRoomIdEqualTo(Integer value) {
      addCriterion("Room_Id =", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdNotEqualTo(Integer value) {
      addCriterion("Room_Id <>", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdGreaterThan(Integer value) {
      addCriterion("Room_Id >", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("Room_Id >=", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdLessThan(Integer value) {
      addCriterion("Room_Id <", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
      addCriterion("Room_Id <=", value, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdIn(List<Integer> values) {
      addCriterion("Room_Id in", values, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdNotIn(List<Integer> values) {
      addCriterion("Room_Id not in", values, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdBetween(Integer value1, Integer value2) {
      addCriterion("Room_Id between", value1, value2, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
      addCriterion("Room_Id not between", value1, value2, "roomId");
      return (Criteria) this;
    }

    public Criteria andRoomNoIsNull() {
      addCriterion("Room_No is null");
      return (Criteria) this;
    }

    public Criteria andRoomNoIsNotNull() {
      addCriterion("Room_No is not null");
      return (Criteria) this;
    }

    public Criteria andRoomNoEqualTo(String value) {
      addCriterion("Room_No =", value, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoNotEqualTo(String value) {
      addCriterion("Room_No <>", value, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoGreaterThan(String value) {
      addCriterion("Room_No >", value, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoGreaterThanOrEqualTo(String value) {
      addCriterion("Room_No >=", value, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoLessThan(String value) {
      addCriterion("Room_No <", value, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoLessThanOrEqualTo(String value) {
      addCriterion("Room_No <=", value, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoLike(String value) {
      addCriterion("Room_No like", value, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoNotLike(String value) {
      addCriterion("Room_No not like", value, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoIn(List<String> values) {
      addCriterion("Room_No in", values, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoNotIn(List<String> values) {
      addCriterion("Room_No not in", values, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoBetween(String value1, String value2) {
      addCriterion("Room_No between", value1, value2, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNoNotBetween(String value1, String value2) {
      addCriterion("Room_No not between", value1, value2, "roomNo");
      return (Criteria) this;
    }

    public Criteria andRoomNameIsNull() {
      addCriterion("Room_Name is null");
      return (Criteria) this;
    }

    public Criteria andRoomNameIsNotNull() {
      addCriterion("Room_Name is not null");
      return (Criteria) this;
    }

    public Criteria andRoomNameEqualTo(String value) {
      addCriterion("Room_Name =", value, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameNotEqualTo(String value) {
      addCriterion("Room_Name <>", value, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameGreaterThan(String value) {
      addCriterion("Room_Name >", value, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
      addCriterion("Room_Name >=", value, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameLessThan(String value) {
      addCriterion("Room_Name <", value, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameLessThanOrEqualTo(String value) {
      addCriterion("Room_Name <=", value, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameLike(String value) {
      addCriterion("Room_Name like", value, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameNotLike(String value) {
      addCriterion("Room_Name not like", value, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameIn(List<String> values) {
      addCriterion("Room_Name in", values, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameNotIn(List<String> values) {
      addCriterion("Room_Name not in", values, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameBetween(String value1, String value2) {
      addCriterion("Room_Name between", value1, value2, "roomName");
      return (Criteria) this;
    }

    public Criteria andRoomNameNotBetween(String value1, String value2) {
      addCriterion("Room_Name not between", value1, value2, "roomName");
      return (Criteria) this;
    }

    public Criteria andCapacityIsNull() {
      addCriterion("Capacity is null");
      return (Criteria) this;
    }

    public Criteria andCapacityIsNotNull() {
      addCriterion("Capacity is not null");
      return (Criteria) this;
    }

    public Criteria andCapacityEqualTo(Integer value) {
      addCriterion("Capacity =", value, "capacity");
      return (Criteria) this;
    }

    public Criteria andCapacityNotEqualTo(Integer value) {
      addCriterion("Capacity <>", value, "capacity");
      return (Criteria) this;
    }

    public Criteria andCapacityGreaterThan(Integer value) {
      addCriterion("Capacity >", value, "capacity");
      return (Criteria) this;
    }

    public Criteria andCapacityGreaterThanOrEqualTo(Integer value) {
      addCriterion("Capacity >=", value, "capacity");
      return (Criteria) this;
    }

    public Criteria andCapacityLessThan(Integer value) {
      addCriterion("Capacity <", value, "capacity");
      return (Criteria) this;
    }

    public Criteria andCapacityLessThanOrEqualTo(Integer value) {
      addCriterion("Capacity <=", value, "capacity");
      return (Criteria) this;
    }

    public Criteria andCapacityIn(List<Integer> values) {
      addCriterion("Capacity in", values, "capacity");
      return (Criteria) this;
    }

    public Criteria andCapacityNotIn(List<Integer> values) {
      addCriterion("Capacity not in", values, "capacity");
      return (Criteria) this;
    }

    public Criteria andCapacityBetween(Integer value1, Integer value2) {
      addCriterion("Capacity between", value1, value2, "capacity");
      return (Criteria) this;
    }

    public Criteria andCapacityNotBetween(Integer value1, Integer value2) {
      addCriterion("Capacity not between", value1, value2, "capacity");
      return (Criteria) this;
    }

    public Criteria andAddressIsNull() {
      addCriterion("Address is null");
      return (Criteria) this;
    }

    public Criteria andAddressIsNotNull() {
      addCriterion("Address is not null");
      return (Criteria) this;
    }

    public Criteria andAddressEqualTo(String value) {
      addCriterion("Address =", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressNotEqualTo(String value) {
      addCriterion("Address <>", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressGreaterThan(String value) {
      addCriterion("Address >", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressGreaterThanOrEqualTo(String value) {
      addCriterion("Address >=", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressLessThan(String value) {
      addCriterion("Address <", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressLessThanOrEqualTo(String value) {
      addCriterion("Address <=", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressLike(String value) {
      addCriterion("Address like", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressNotLike(String value) {
      addCriterion("Address not like", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressIn(List<String> values) {
      addCriterion("Address in", values, "address");
      return (Criteria) this;
    }

    public Criteria andAddressNotIn(List<String> values) {
      addCriterion("Address not in", values, "address");
      return (Criteria) this;
    }

    public Criteria andAddressBetween(String value1, String value2) {
      addCriterion("Address between", value1, value2, "address");
      return (Criteria) this;
    }

    public Criteria andAddressNotBetween(String value1, String value2) {
      addCriterion("Address not between", value1, value2, "address");
      return (Criteria) this;
    }

    public Criteria andDescriptionIsNull() {
      addCriterion("Description is null");
      return (Criteria) this;
    }

    public Criteria andDescriptionIsNotNull() {
      addCriterion("Description is not null");
      return (Criteria) this;
    }

    public Criteria andDescriptionEqualTo(String value) {
      addCriterion("Description =", value, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionNotEqualTo(String value) {
      addCriterion("Description <>", value, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionGreaterThan(String value) {
      addCriterion("Description >", value, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
      addCriterion("Description >=", value, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionLessThan(String value) {
      addCriterion("Description <", value, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionLessThanOrEqualTo(String value) {
      addCriterion("Description <=", value, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionLike(String value) {
      addCriterion("Description like", value, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionNotLike(String value) {
      addCriterion("Description not like", value, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionIn(List<String> values) {
      addCriterion("Description in", values, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionNotIn(List<String> values) {
      addCriterion("Description not in", values, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionBetween(String value1, String value2) {
      addCriterion("Description between", value1, value2, "description");
      return (Criteria) this;
    }

    public Criteria andDescriptionNotBetween(String value1, String value2) {
      addCriterion("Description not between", value1, value2, "description");
      return (Criteria) this;
    }

    public Criteria andEnabledIsNull() {
      addCriterion("enabled is null");
      return (Criteria) this;
    }

    public Criteria andEnabledIsNotNull() {
      addCriterion("enabled is not null");
      return (Criteria) this;
    }

    public Criteria andEnabledEqualTo(Integer value) {
      addCriterion("enabled =", value, "enabled");
      return (Criteria) this;
    }

    public Criteria andEnabledNotEqualTo(Integer value) {
      addCriterion("enabled <>", value, "enabled");
      return (Criteria) this;
    }

    public Criteria andEnabledGreaterThan(Integer value) {
      addCriterion("enabled >", value, "enabled");
      return (Criteria) this;
    }

    public Criteria andEnabledGreaterThanOrEqualTo(Integer value) {
      addCriterion("enabled >=", value, "enabled");
      return (Criteria) this;
    }

    public Criteria andEnabledLessThan(Integer value) {
      addCriterion("enabled <", value, "enabled");
      return (Criteria) this;
    }

    public Criteria andEnabledLessThanOrEqualTo(Integer value) {
      addCriterion("enabled <=", value, "enabled");
      return (Criteria) this;
    }

    public Criteria andEnabledIn(List<Integer> values) {
      addCriterion("enabled in", values, "enabled");
      return (Criteria) this;
    }

    public Criteria andEnabledNotIn(List<Integer> values) {
      addCriterion("enabled not in", values, "enabled");
      return (Criteria) this;
    }

    public Criteria andEnabledBetween(Integer value1, Integer value2) {
      addCriterion("enabled between", value1, value2, "enabled");
      return (Criteria) this;
    }

    public Criteria andEnabledNotBetween(Integer value1, Integer value2) {
      addCriterion("enabled not between", value1, value2, "enabled");
      return (Criteria) this;
    }

    public Criteria andRemarkIsNull() {
      addCriterion("Remark is null");
      return (Criteria) this;
    }

    public Criteria andRemarkIsNotNull() {
      addCriterion("Remark is not null");
      return (Criteria) this;
    }

    public Criteria andRemarkEqualTo(String value) {
      addCriterion("Remark =", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotEqualTo(String value) {
      addCriterion("Remark <>", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkGreaterThan(String value) {
      addCriterion("Remark >", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkGreaterThanOrEqualTo(String value) {
      addCriterion("Remark >=", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkLessThan(String value) {
      addCriterion("Remark <", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkLessThanOrEqualTo(String value) {
      addCriterion("Remark <=", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkLike(String value) {
      addCriterion("Remark like", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotLike(String value) {
      addCriterion("Remark not like", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkIn(List<String> values) {
      addCriterion("Remark in", values, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotIn(List<String> values) {
      addCriterion("Remark not in", values, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkBetween(String value1, String value2) {
      addCriterion("Remark between", value1, value2, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotBetween(String value1, String value2) {
      addCriterion("Remark not between", value1, value2, "remark");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdIsNull() {
      addCriterion("Create_User_Id is null");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdIsNotNull() {
      addCriterion("Create_User_Id is not null");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdEqualTo(Integer value) {
      addCriterion("Create_User_Id =", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdNotEqualTo(Integer value) {
      addCriterion("Create_User_Id <>", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdGreaterThan(Integer value) {
      addCriterion("Create_User_Id >", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("Create_User_Id >=", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdLessThan(Integer value) {
      addCriterion("Create_User_Id <", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
      addCriterion("Create_User_Id <=", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdIn(List<Integer> values) {
      addCriterion("Create_User_Id in", values, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdNotIn(List<Integer> values) {
      addCriterion("Create_User_Id not in", values, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
      addCriterion("Create_User_Id between", value1, value2, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
      addCriterion("Create_User_Id not between", value1, value2, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIsNull() {
      addCriterion("Create_Time is null");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIsNotNull() {
      addCriterion("Create_Time is not null");
      return (Criteria) this;
    }

    public Criteria andCreateTimeEqualTo(Date value) {
      addCriterion("Create_Time =", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotEqualTo(Date value) {
      addCriterion("Create_Time <>", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeGreaterThan(Date value) {
      addCriterion("Create_Time >", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("Create_Time >=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeLessThan(Date value) {
      addCriterion("Create_Time <", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
      addCriterion("Create_Time <=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIn(List<Date> values) {
      addCriterion("Create_Time in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotIn(List<Date> values) {
      addCriterion("Create_Time not in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeBetween(Date value1, Date value2) {
      addCriterion("Create_Time between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
      addCriterion("Create_Time not between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIsNull() {
      addCriterion("Update_Time is null");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIsNotNull() {
      addCriterion("Update_Time is not null");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeEqualTo(Date value) {
      addCriterion("Update_Time =", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotEqualTo(Date value) {
      addCriterion("Update_Time <>", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeGreaterThan(Date value) {
      addCriterion("Update_Time >", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("Update_Time >=", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeLessThan(Date value) {
      addCriterion("Update_Time <", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
      addCriterion("Update_Time <=", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIn(List<Date> values) {
      addCriterion("Update_Time in", values, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotIn(List<Date> values) {
      addCriterion("Update_Time not in", values, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeBetween(Date value1, Date value2) {
      addCriterion("Update_Time between", value1, value2, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
      addCriterion("Update_Time not between", value1, value2, "updateTime");
      return (Criteria) this;
    }
  }

  /**
   * null
   * <p/>
   * t_meeting_room
   * 
   * @date Fri Apr 05 12:36:01 CST 2019
   */
  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  /**
   * MeetingRoom
   * <p/>
   * t_meeting_room
   * 
   * @date Fri Apr 05 12:36:01 CST 2019
   */
  public static class Criterion {
    private String condition;

    private Object value;

    private Object secondValue;

    private boolean noValue;

    private boolean singleValue;

    private boolean betweenValue;

    private boolean listValue;

    private String typeHandler;

    public String getCondition() {
      return condition;
    }

    public Object getValue() {
      return value;
    }

    public Object getSecondValue() {
      return secondValue;
    }

    public boolean isNoValue() {
      return noValue;
    }

    public boolean isSingleValue() {
      return singleValue;
    }

    public boolean isBetweenValue() {
      return betweenValue;
    }

    public boolean isListValue() {
      return listValue;
    }

    public String getTypeHandler() {
      return typeHandler;
    }

    protected Criterion(String condition) {
      super();
      this.condition = condition;
      this.typeHandler = null;
      this.noValue = true;
    }

    protected Criterion(String condition, Object value, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.typeHandler = typeHandler;
      if (value instanceof List<?>) {
        this.listValue = true;
      } else {
        this.singleValue = true;
      }
    }

    protected Criterion(String condition, Object value) {
      this(condition, value, null);
    }

    protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.secondValue = secondValue;
      this.typeHandler = typeHandler;
      this.betweenValue = true;
    }

    protected Criterion(String condition, Object value, Object secondValue) {
      this(condition, value, secondValue, null);
    }
  }
}