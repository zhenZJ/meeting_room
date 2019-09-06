/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.dao;

import org.springframework.stereotype.Repository;

import com.zm.core.base.dao.BaseMapper;
import com.zm.mr.model.MeetingRoom;
import com.zm.mr.model.MeetingRoomExample;


@Repository("meetingRoomMapper")
public interface MeetingRoomMapper extends BaseMapper<MeetingRoom, MeetingRoomExample, Integer> {
}