package com.example.takeTicket.service;

import com.example.takeTicket.domain.CustPointRecord;

/**
 * Cteated by caoxx on 2018/11/6
 */
public interface PointService {



    /**
     * 根据客户ID和商铺ID查改商铺的积分
     * @param shop
     * @return
     */
	CustPointRecord getPoint(String custId,String shopId);
}