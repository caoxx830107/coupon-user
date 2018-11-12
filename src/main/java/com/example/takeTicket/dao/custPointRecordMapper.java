package com.example.takeTicket.dao;

import com.example.takeTicket.domain.custPointRecord;

public interface custPointRecordMapper {
    int insert(custPointRecord record);

    int insertSelective(custPointRecord record);
}