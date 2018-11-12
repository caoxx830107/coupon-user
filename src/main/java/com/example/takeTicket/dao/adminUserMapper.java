package com.example.takeTicket.dao;

import com.example.takeTicket.domain.adminUser;

public interface adminUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(adminUser record);

    int insertSelective(adminUser record);

    adminUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(adminUser record);

    int updateByPrimaryKey(adminUser record);
}