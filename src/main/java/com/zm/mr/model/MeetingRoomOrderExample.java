/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zm.core.base.model.BaseExample;

@SuppressWarnings("serial")
public class MeetingRoomOrderExample extends BaseExample implements Serializable {
  /**
   * @date Sat Mar 30 21:54:26 CST 2019
   */
  protected String orderByClause;

  /**
   * @date Sat Mar 30 21:54:26 CST 2019
   */
  protected boolean distinct;

  /**
   * @date Sat Mar 30 21:54:26 CST 2019
   */
  protected List<Criteria> oredCriteria;

  private Date startDatePlan;

  private Date endDatePlan;

  /**
   * @return the startDatePlan
   */
  public Date getStartDatePlan() {
    return startDatePlan;
  }

  /**
   * @param startDatePlan
   *          the startDatePlan to set
   */
  public void setStartDatePlan(Date startDatePlan) {
    this.startDatePlan = startDatePlan;
  }

  /**
   * @return the endDatePlan
   */
  public Date getEndDatePlan() {
    return endDatePlan;
  }

  /**
   * @param endDatePlan
   *          the endDatePlan to set
   */
  public void setEndDatePlan(Date endDatePlan) {
    this.endDatePlan = endDatePlan;
  }

  public MeetingRoomOrderExample() {
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
   * MeetingRoomOrder
   * <p/>
   * t_meeting_room_order
   * 
   * @date Sat Mar 30 21:54:26 CST 2019
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

    public Criteria andOrderIdIsNull() {
      addCriterion("Order_Id is null");
      return (Criteria) this;
    }

    public Criteria andOrderIdIsNotNull() {
      addCriterion("Order_Id is not null");
      return (Criteria) this;
    }

    public Criteria andOrderIdEqualTo(Integer value) {
      addCriterion("Order_Id =", value, "orderId");
      return (Criteria) this;
    }

    public Criteria andOrderIdNotEqualTo(Integer value) {
      addCriterion("Order_Id <>", value, "orderId");
      return (Criteria) this;
    }

    public Criteria andOrderIdGreaterThan(Integer value) {
      addCriterion("Order_Id >", value, "orderId");
      return (Criteria) this;
    }

    public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("Order_Id >=", value, "orderId");
      return (Criteria) this;
    }

    public Criteria andOrderIdLessThan(Integer value) {
      addCriterion("Order_Id <", value, "orderId");
      return (Criteria) this;
    }

    public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
      addCriterion("Order_Id <=", value, "orderId");
      return (Criteria) this;
    }

    public Criteria andOrderIdIn(List<Integer> values) {
      addCriterion("Order_Id in", values, "orderId");
      return (Criteria) this;
    }

    public Criteria andOrderIdNotIn(List<Integer> values) {
      addCriterion("Order_Id not in", values, "orderId");
      return (Criteria) this;
    }

    public Criteria andOrderIdBetween(Integer value1, Integer value2) {
      addCriterion("Order_Id between", value1, value2, "orderId");
      return (Criteria) this;
    }

    public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
      addCriterion("Order_Id not between", value1, value2, "orderId");
      return (Criteria) this;
    }

    public Criteria andOrderNoIsNull() {
      addCriterion("Order_No is null");
      return (Criteria) this;
    }

    public Criteria andOrderNoIsNotNull() {
      addCriterion("Order_No is not null");
      return (Criteria) this;
    }

    public Criteria andOrderNoEqualTo(String value) {
      addCriterion("Order_No =", value, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoNotEqualTo(String value) {
      addCriterion("Order_No <>", value, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoGreaterThan(String value) {
      addCriterion("Order_No >", value, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
      addCriterion("Order_No >=", value, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoLessThan(String value) {
      addCriterion("Order_No <", value, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoLessThanOrEqualTo(String value) {
      addCriterion("Order_No <=", value, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoLike(String value) {
      addCriterion("Order_No like", value, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoNotLike(String value) {
      addCriterion("Order_No not like", value, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoIn(List<String> values) {
      addCriterion("Order_No in", values, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoNotIn(List<String> values) {
      addCriterion("Order_No not in", values, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoBetween(String value1, String value2) {
      addCriterion("Order_No between", value1, value2, "orderNo");
      return (Criteria) this;
    }

    public Criteria andOrderNoNotBetween(String value1, String value2) {
      addCriterion("Order_No not between", value1, value2, "orderNo");
      return (Criteria) this;
    }

    public Criteria andUserIdIsNull() {
      addCriterion("User_Id is null");
      return (Criteria) this;
    }

    public Criteria andUserIdIsNotNull() {
      addCriterion("User_Id is not null");
      return (Criteria) this;
    }

    public Criteria andUserIdEqualTo(Integer value) {
      addCriterion("User_Id =", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotEqualTo(Integer value) {
      addCriterion("User_Id <>", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdGreaterThan(Integer value) {
      addCriterion("User_Id >", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("User_Id >=", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdLessThan(Integer value) {
      addCriterion("User_Id <", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdLessThanOrEqualTo(Integer value) {
      addCriterion("User_Id <=", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdIn(List<Integer> values) {
      addCriterion("User_Id in", values, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotIn(List<Integer> values) {
      addCriterion("User_Id not in", values, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdBetween(Integer value1, Integer value2) {
      addCriterion("User_Id between", value1, value2, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
      addCriterion("User_Id not between", value1, value2, "userId");
      return (Criteria) this;
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

    public Criteria andOrderDateIsNull() {
      addCriterion("Order_Date is null");
      return (Criteria) this;
    }

    public Criteria andOrderDateIsNotNull() {
      addCriterion("Order_Date is not null");
      return (Criteria) this;
    }

    public Criteria andOrderDateEqualTo(Date value) {
      addCriterion("Order_Date =", value, "orderDate");
      return (Criteria) this;
    }

    public Criteria andOrderDateNotEqualTo(Date value) {
      addCriterion("Order_Date <>", value, "orderDate");
      return (Criteria) this;
    }

    public Criteria andOrderDateGreaterThan(Date value) {
      addCriterion("Order_Date >", value, "orderDate");
      return (Criteria) this;
    }

    public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
      addCriterion("Order_Date >=", value, "orderDate");
      return (Criteria) this;
    }

    public Criteria andOrderDateLessThan(Date value) {
      addCriterion("Order_Date <", value, "orderDate");
      return (Criteria) this;
    }

    public Criteria andOrderDateLessThanOrEqualTo(Date value) {
      addCriterion("Order_Date <=", value, "orderDate");
      return (Criteria) this;
    }

    public Criteria andOrderDateIn(List<Date> values) {
      addCriterion("Order_Date in", values, "orderDate");
      return (Criteria) this;
    }

    public Criteria andOrderDateNotIn(List<Date> values) {
      addCriterion("Order_Date not in", values, "orderDate");
      return (Criteria) this;
    }

    public Criteria andOrderDateBetween(Date value1, Date value2) {
      addCriterion("Order_Date between", value1, value2, "orderDate");
      return (Criteria) this;
    }

    public Criteria andOrderDateNotBetween(Date value1, Date value2) {
      addCriterion("Order_Date not between", value1, value2, "orderDate");
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

    public Criteria andStarDatePlanIsNull() {
      addCriterion("Star_Date_Plan is null");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanIsNotNull() {
      addCriterion("Star_Date_Plan is not null");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanEqualTo(Date value) {
      addCriterion("Star_Date_Plan =", value, "starDatePlan");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanNotEqualTo(Date value) {
      addCriterion("Star_Date_Plan <>", value, "starDatePlan");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanGreaterThan(Date value) {
      addCriterion("Star_Date_Plan >", value, "starDatePlan");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanGreaterThanOrEqualTo(Date value) {
      addCriterion("Star_Date_Plan >=", value, "starDatePlan");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanLessThan(Date value) {
      addCriterion("Star_Date_Plan <", value, "starDatePlan");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanLessThanOrEqualTo(Date value) {
      addCriterion("Star_Date_Plan <=", value, "starDatePlan");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanIn(List<Date> values) {
      addCriterion("Star_Date_Plan in", values, "starDatePlan");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanNotIn(List<Date> values) {
      addCriterion("Star_Date_Plan not in", values, "starDatePlan");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanBetween(Date value1, Date value2) {
      addCriterion("Star_Date_Plan between", value1, value2, "starDatePlan");
      return (Criteria) this;
    }

    public Criteria andStarDatePlanNotBetween(Date value1, Date value2) {
      addCriterion("Star_Date_Plan not between", value1, value2, "starDatePlan");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanIsNull() {
      addCriterion("End_Date_Plan is null");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanIsNotNull() {
      addCriterion("End_Date_Plan is not null");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanEqualTo(Date value) {
      addCriterion("End_Date_Plan =", value, "endDatePlan");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanNotEqualTo(Date value) {
      addCriterion("End_Date_Plan <>", value, "endDatePlan");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanGreaterThan(Date value) {
      addCriterion("End_Date_Plan >", value, "endDatePlan");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanGreaterThanOrEqualTo(Date value) {
      addCriterion("End_Date_Plan >=", value, "endDatePlan");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanLessThan(Date value) {
      addCriterion("End_Date_Plan <", value, "endDatePlan");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanLessThanOrEqualTo(Date value) {
      addCriterion("End_Date_Plan <=", value, "endDatePlan");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanIn(List<Date> values) {
      addCriterion("End_Date_Plan in", values, "endDatePlan");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanNotIn(List<Date> values) {
      addCriterion("End_Date_Plan not in", values, "endDatePlan");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanBetween(Date value1, Date value2) {
      addCriterion("End_Date_Plan between", value1, value2, "endDatePlan");
      return (Criteria) this;
    }

    public Criteria andEndDatePlanNotBetween(Date value1, Date value2) {
      addCriterion("End_Date_Plan not between", value1, value2, "endDatePlan");
      return (Criteria) this;
    }

    public Criteria andStarDateActualIsNull() {
      addCriterion("Star_Date_Actual is null");
      return (Criteria) this;
    }

    public Criteria andStarDateActualIsNotNull() {
      addCriterion("Star_Date_Actual is not null");
      return (Criteria) this;
    }

    public Criteria andStarDateActualEqualTo(Date value) {
      addCriterion("Star_Date_Actual =", value, "starDateActual");
      return (Criteria) this;
    }

    public Criteria andStarDateActualNotEqualTo(Date value) {
      addCriterion("Star_Date_Actual <>", value, "starDateActual");
      return (Criteria) this;
    }

    public Criteria andStarDateActualGreaterThan(Date value) {
      addCriterion("Star_Date_Actual >", value, "starDateActual");
      return (Criteria) this;
    }

    public Criteria andStarDateActualGreaterThanOrEqualTo(Date value) {
      addCriterion("Star_Date_Actual >=", value, "starDateActual");
      return (Criteria) this;
    }

    public Criteria andStarDateActualLessThan(Date value) {
      addCriterion("Star_Date_Actual <", value, "starDateActual");
      return (Criteria) this;
    }

    public Criteria andStarDateActualLessThanOrEqualTo(Date value) {
      addCriterion("Star_Date_Actual <=", value, "starDateActual");
      return (Criteria) this;
    }

    public Criteria andStarDateActualIn(List<Date> values) {
      addCriterion("Star_Date_Actual in", values, "starDateActual");
      return (Criteria) this;
    }

    public Criteria andStarDateActualNotIn(List<Date> values) {
      addCriterion("Star_Date_Actual not in", values, "starDateActual");
      return (Criteria) this;
    }

    public Criteria andStarDateActualBetween(Date value1, Date value2) {
      addCriterion("Star_Date_Actual between", value1, value2, "starDateActual");
      return (Criteria) this;
    }

    public Criteria andStarDateActualNotBetween(Date value1, Date value2) {
      addCriterion("Star_Date_Actual not between", value1, value2, "starDateActual");
      return (Criteria) this;
    }

    public Criteria andEndDateActualIsNull() {
      addCriterion("End_Date_Actual is null");
      return (Criteria) this;
    }

    public Criteria andEndDateActualIsNotNull() {
      addCriterion("End_Date_Actual is not null");
      return (Criteria) this;
    }

    public Criteria andEndDateActualEqualTo(Date value) {
      addCriterion("End_Date_Actual =", value, "endDateActual");
      return (Criteria) this;
    }

    public Criteria andEndDateActualNotEqualTo(Date value) {
      addCriterion("End_Date_Actual <>", value, "endDateActual");
      return (Criteria) this;
    }

    public Criteria andEndDateActualGreaterThan(Date value) {
      addCriterion("End_Date_Actual >", value, "endDateActual");
      return (Criteria) this;
    }

    public Criteria andEndDateActualGreaterThanOrEqualTo(Date value) {
      addCriterion("End_Date_Actual >=", value, "endDateActual");
      return (Criteria) this;
    }

    public Criteria andEndDateActualLessThan(Date value) {
      addCriterion("End_Date_Actual <", value, "endDateActual");
      return (Criteria) this;
    }

    public Criteria andEndDateActualLessThanOrEqualTo(Date value) {
      addCriterion("End_Date_Actual <=", value, "endDateActual");
      return (Criteria) this;
    }

    public Criteria andEndDateActualIn(List<Date> values) {
      addCriterion("End_Date_Actual in", values, "endDateActual");
      return (Criteria) this;
    }

    public Criteria andEndDateActualNotIn(List<Date> values) {
      addCriterion("End_Date_Actual not in", values, "endDateActual");
      return (Criteria) this;
    }

    public Criteria andEndDateActualBetween(Date value1, Date value2) {
      addCriterion("End_Date_Actual between", value1, value2, "endDateActual");
      return (Criteria) this;
    }

    public Criteria andEndDateActualNotBetween(Date value1, Date value2) {
      addCriterion("End_Date_Actual not between", value1, value2, "endDateActual");
      return (Criteria) this;
    }

    public Criteria andStatusIdIsNull() {
      addCriterion("Status_Id is null");
      return (Criteria) this;
    }

    public Criteria andStatusIdIsNotNull() {
      addCriterion("Status_Id is not null");
      return (Criteria) this;
    }

    public Criteria andStatusIdEqualTo(Integer value) {
      addCriterion("Status_Id =", value, "statusId");
      return (Criteria) this;
    }

    public Criteria andStatusIdNotEqualTo(Integer value) {
      addCriterion("Status_Id <>", value, "statusId");
      return (Criteria) this;
    }

    public Criteria andStatusIdGreaterThan(Integer value) {
      addCriterion("Status_Id >", value, "statusId");
      return (Criteria) this;
    }

    public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("Status_Id >=", value, "statusId");
      return (Criteria) this;
    }

    public Criteria andStatusIdLessThan(Integer value) {
      addCriterion("Status_Id <", value, "statusId");
      return (Criteria) this;
    }

    public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
      addCriterion("Status_Id <=", value, "statusId");
      return (Criteria) this;
    }

    public Criteria andStatusIdIn(List<Integer> values) {
      addCriterion("Status_Id in", values, "statusId");
      return (Criteria) this;
    }

    public Criteria andStatusIdNotIn(List<Integer> values) {
      addCriterion("Status_Id not in", values, "statusId");
      return (Criteria) this;
    }

    public Criteria andStatusIdBetween(Integer value1, Integer value2) {
      addCriterion("Status_Id between", value1, value2, "statusId");
      return (Criteria) this;
    }

    public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
      addCriterion("Status_Id not between", value1, value2, "statusId");
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
   * t_meeting_room_order
   * 
   * @date Sat Mar 30 21:54:26 CST 2019
   */
  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  /**
   * MeetingRoomOrder
   * <p/>
   * t_meeting_room_order
   * 
   * @date Sat Mar 30 21:54:26 CST 2019
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