/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.model;

import java.io.Serializable;
import java.util.Date;

/**
 * t_meeting_room<p/>
 * @date Fri Apr 05 12:36:01 CST 2019
 *
 */
@SuppressWarnings("serial")
public class MeetingRoom implements Serializable {
    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private Integer roomId;

    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private String roomNo;

    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private String roomName;

    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private Integer capacity;

    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private String address;

    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private String description;

    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private Integer enabled;

    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private String remark;

    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private Integer createUserId;

    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private Date createTime;

    /**
     * 
     * @author 
     * @date Fri Apr 05 12:36:01 CST 2019
     * @return
     */
    private Date updateTime;

    /**
     * @return null : 
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * @param roomId : 
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * @return null : 
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * @param roomNo : 
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo == null ? null : roomNo.trim();
    }

    /**
     * @return null : 
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * @param roomName : 
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    /**
     * @return null : 
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * @param capacity : 
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * @return null : 
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address : 
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return null : 
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description : 
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roomId=").append(roomId);
        sb.append(", roomNo=").append(roomNo);
        sb.append(", roomName=").append(roomName);
        sb.append(", capacity=").append(capacity);
        sb.append(", address=").append(address);
        sb.append(", description=").append(description);
        sb.append(", enabled=").append(enabled);
        sb.append(", remark=").append(remark);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}