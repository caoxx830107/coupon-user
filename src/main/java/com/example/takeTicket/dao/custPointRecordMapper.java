package com.example.takeTicket.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.takeTicket.domain.CustPointRecord;

public interface custPointRecordMapper {
    int insert(CustPointRecord record);

    int insertSelective(CustPointRecord record);
    
    @Select("select * from CUST_POINT_RECORD where CUST_ID = #{custId} and SHOP_ID = #{shopId}")
    CustPointRecord getPoint(@Param("custId")String custId,@Param("shopId")String shopId);
}