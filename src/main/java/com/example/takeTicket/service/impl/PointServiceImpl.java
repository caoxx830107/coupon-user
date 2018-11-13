package com.example.takeTicket.service.impl;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.takeTicket.dao.custCouponRecordMapper;
import com.example.takeTicket.dao.custPointRecordMapper;
import com.example.takeTicket.dao.getPointRecordMapper;
import com.example.takeTicket.domain.CustPointRecord;
import com.example.takeTicket.service.PointService;

/**
 * Cteated by caoxx on 2018/11/6
 */
@Service
public class PointServiceImpl  implements PointService {

    @Autowired
    custCouponRecordMapper custCouponRecordMapper;

    @Autowired
    custPointRecordMapper custPointRecordMapper;
    
    @Autowired
    getPointRecordMapper getPointRecordMapper;

	
	@Override
	public CustPointRecord getPoint(String custId, String shopId) {
		CustPointRecord custPointRecordRet = new CustPointRecord();
		custPointRecordRet = custPointRecordMapper.getPoint(custId, shopId);
		return custPointRecordRet;
	}

	

    
}
