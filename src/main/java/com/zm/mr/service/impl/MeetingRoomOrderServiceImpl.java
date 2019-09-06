/*** copyright (c) 2019 Marvis  ***/
package com.zm.mr.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zm.core.base.service.impl.BaseServiceImpl;
import com.zm.mr.dao.MeetingRoomOrderMapper;
import com.zm.mr.model.MeetingRoomOrder;
import com.zm.mr.model.MeetingRoomOrderExample;
import com.zm.mr.service.MeetingRoomOrderService;

@Service
public class MeetingRoomOrderServiceImpl extends BaseServiceImpl<MeetingRoomOrder, MeetingRoomOrderExample, Integer>
    implements MeetingRoomOrderService {

  @SuppressWarnings("unused")
  private static final Logger logger = LoggerFactory.getLogger(MeetingRoomOrderServiceImpl.class);

  @Autowired
  public MeetingRoomOrderMapper meetingRoomOrderMapper;

  @Autowired
  public void setMapper() {
    super.setMapper(meetingRoomOrderMapper);
  }
}