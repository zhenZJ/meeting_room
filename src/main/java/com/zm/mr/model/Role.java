/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.model;

import java.io.Serializable;
import java.util.Date;

/**
 * t_role<p/>
 * @date Fri Apr 05 09:10:47 CST 2019
 *
 */
@SuppressWarnings("serial")
public class Role implements Serializable {
    /**
     * 
     * @author 
     * @date Fri Apr 05 09:10:47 CST 2019
     * @return
     */
    private Integer roleId;

    /**
     * 
     * @author 
     * @date Fri Apr 05 09:10:47 CST 2019
     * @return
     */
    private String roleName;

    /**
     * 
     * @author 
     * @date Fri Apr 05 09:10:47 CST 2019
     * @return
     */
    private Integer createUserId;

    /**
     * 
     * @author 
     * @date Fri Apr 05 09:10:47 CST 2019
     * @return
     */
    private Date createTime;

    /**
     * 
     * @author 
     * @date Fri Apr 05 09:10:47 CST 2019
     * @return
     */
    private Date updateTime;

    /**
     * 
     * @author 
     * @date Fri Apr 05 09:10:47 CST 2019
     * @return
     */
    private Integer enabled;

    /**
     * 
     * @author 
     * @date Fri Apr 05 09:10:47 CST 2019
     * @return
     */
    private String remark;

    /**
     * @return null : 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId : 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return null : 
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName : 
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * @return null : 
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * @param createUserId : 
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
     * @param createTime : 
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
     * @param updateTime : 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return null : 
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * @param enabled : 
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * @return null : 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark : 
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", enabled=").append(enabled);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}