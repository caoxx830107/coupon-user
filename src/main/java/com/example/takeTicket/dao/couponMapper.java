package com.example.takeTicket.dao;

import com.example.takeTicket.domain.coupon;

public interface couponMapper {
    int deleteByPrimaryKey(String couponId);

    int insert(coupon record);

    int insertSelective(coupon record);

    coupon selectByPrimaryKey(String couponId);

    int updateByPrimaryKeySelective(coupon record);

    int updateByPrimaryKey(coupon record);
}