package com.example.takeTicket.dao;

import com.example.takeTicket.domain.getPointRecord;

public interface getPointRecordMapper {
    int insert(getPointRecord record);

    int insertSelective(getPointRecord record);
}