package com.example.takeTicket.dao;

import com.example.takeTicket.domain.custCouponRecord;

public interface custCouponRecordMapper {
    int deleteByPrimaryKey(String custCouponId);

    int insert(custCouponRecord record);

    int insertSelective(custCouponRecord record);

    custCouponRecord selectByPrimaryKey(String custCouponId);

    int updateByPrimaryKeySelective(custCouponRecord record);

    int updateByPrimaryKey(custCouponRecord record);
}