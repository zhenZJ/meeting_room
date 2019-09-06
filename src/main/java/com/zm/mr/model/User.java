/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.model;

import java.io.Serializable;
import java.util.Date;

/**
 * t_user
 * <p/>
 * 
 * @date Sun Mar 31 19:55:20 CST 2019
 *
 */
@SuppressWarnings("serial")
public class User implements Serializable {
  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private Integer userId;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private String userNo;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private String userName;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private Integer roleId;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private Integer age;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private String sex;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private String userAccount;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private String userPwd;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private String phone;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private String email;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private Integer enabled;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private Integer createUserid;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private Date createTime;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private Date updateTime;

  /**
   * 
   * @author
   * @date Sun Mar 31 19:55:20 CST 2019
   * @return
   */
  private String remark;

  private Role role;

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
  public String getUserNo() {
    return userNo;
  }

  /**
   * @param userNo
   *          :
   */
  public void setUserNo(String userNo) {
    this.userNo = userNo == null ? null : userNo.trim();
  }

  /**
   * @return null :
   */
  public String getUserName() {
    return userName;
  }

  /**
   * @param userName
   *          :
   */
  public void setUserName(String userName) {
    this.userName = userName == null ? null : userName.trim();
  }

  /**
   * @return null :
   */
  public Integer getRoleId() {
    return roleId;
  }

  /**
   * @param roleId
   *          :
   */
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  /**
   * @return null :
   */
  public Integer getAge() {
    return age;
  }

  /**
   * @param age
   *          :
   */
  public void setAge(Integer age) {
    this.age = age;
  }

  /**
   * @return null :
   */
  public String getSex() {
    return sex;
  }

  /**
   * @param sex
   *          :
   */
  public void setSex(String sex) {
    this.sex = sex == null ? null : sex.trim();
  }

  /**
   * @return null :
   */
  public String getUserAccount() {
    return userAccount;
  }

  /**
   * @param userAccount
   *          :
   */
  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount == null ? null : userAccount.trim();
  }

  /**
   * @return null :
   */
  public String getUserPwd() {
    return userPwd;
  }

  /**
   * @param userPwd
   *          :
   */
  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd == null ? null : userPwd.trim();
  }

  /**
   * @return null :
   */
  public String getPhone() {
    return phone;
  }

  /**
   * @param phone
   *          :
   */
  public void setPhone(String phone) {
    this.phone = phone == null ? null : phone.trim();
  }

  /**
   * @return null :
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email
   *          :
   */
  public void setEmail(String email) {
    this.email = email == null ? null : email.trim();
  }

  /**
   * @return null :
   */
  public Integer getEnabled() {
    return enabled;
  }

  /**
   * @param enabled
   *          :
   */
  public void setEnabled(Integer enabled) {
    this.enabled = enabled;
  }

  /**
   * @return null :
   */
  public Integer getCreateUserid() {
    return createUserid;
  }

  /**
   * @param createUserid
   *          :
   */
  public void setCreateUserid(Integer createUserid) {
    this.createUserid = createUserid;
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
   * @return the role
   */
  public Role getRole() {
    return role;
  }

  /**
   * @param role
   *          the role to set
   */
  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", userId=").append(userId);
    sb.append(", userNo=").append(userNo);
    sb.append(", userName=").append(userName);
    sb.append(", roleId=").append(roleId);
    sb.append(", role=").append(role);
    sb.append(", age=").append(age);
    sb.append(", sex=").append(sex);
    sb.append(", userAccount=").append(userAccount);
    sb.append(", userPwd=").append(userPwd);
    sb.append(", phone=").append(phone);
    sb.append(", email=").append(email);
    sb.append(", enabled=").append(enabled);
    sb.append(", createUserid=").append(createUserid);
    sb.append(", createTime=").append(createTime);
    sb.append(", updateTime=").append(updateTime);
    sb.append(", remark=").append(remark);
    sb.append("]");
    return sb.toString();
  }
}