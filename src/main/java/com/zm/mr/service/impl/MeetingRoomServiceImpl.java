/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.service.impl;

import com.zm.core.base.service.impl.BaseServiceImpl;
import com.zm.mr.dao.MeetingRoomMapper;
import com.zm.mr.model.MeetingRoom;
import com.zm.mr.model.MeetingRoomExample;
import com.zm.mr.service.MeetingRoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingRoomServiceImpl extends BaseServiceImpl<MeetingRoom, MeetingRoomExample, Integer> implements MeetingRoomService {
    
    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(MeetingRoomServiceImpl.class);

    @Autowired
    public MeetingRoomMapper meetingRoomMapper;

    @Autowired
    public void setMapper() {
        super.setMapper(meetingRoomMapper);
    }
}