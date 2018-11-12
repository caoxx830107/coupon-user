package com.example.takeTicket.dao;

import com.example.takeTicket.domain.shop;

public interface shopMapper {
    int deleteByPrimaryKey(String shopId);

    int insert(shop record);

    int insertSelective(shop record);

    shop selectByPrimaryKey(String shopId);

    int updateByPrimaryKeySelective(shop record);

    int updateByPrimaryKey(shop record);
}