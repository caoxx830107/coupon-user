package com.example.takeTicket.service;

import java.math.BigDecimal;

import com.example.takeTicket.domain.CustPointRecord;

/**
 * Cteated by caoxx on 2018/11/6
 */
public interface PointService {



    /**
     * 根据客户ID和商铺ID查商铺的积分
     * @param shop
     * @return
     */
	CustPointRecord getPoint(String custId,String shopId);
	
	/**
     * 根据客户ID和商铺ID增加商铺的积分
     * @param shop
     * @return
     */
	void addPoint(String custId,String shopId,BigDecimal pointNum);
	
	/**
     * 根据客户ID和商铺ID因为要兑换所以减少商铺的积分
     * @param shop
     * @return
     */
	void subPoint(String custId,String shopId,BigDecimal subPointNum);
}
