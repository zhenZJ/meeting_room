/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.dao;

import org.springframework.stereotype.Repository;

import com.zm.core.base.dao.BaseMapper;
import com.zm.mr.model.MeetingRoomOrder;
import com.zm.mr.model.MeetingRoomOrderExample;

@Repository("meetingRoomOrderMapper")
public interface MeetingRoomOrderMapper extends BaseMapper<MeetingRoomOrder, MeetingRoomOrderExample, Integer> {
}