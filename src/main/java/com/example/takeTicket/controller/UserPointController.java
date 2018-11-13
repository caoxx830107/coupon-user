package com.example.takeTicket.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.takeTicket.domain.CustPointRecord;
import com.example.takeTicket.exception.MilkTeaException;
import com.example.takeTicket.service.PointService;
import com.example.takeTicket.vo.ResponseBody;


@Controller
@RequestMapping("/UserPoint")
public class UserPointController {

	@Autowired
	PointService pointService;
	

	//据客户ID和商铺ID查改商铺的积分
    @RequestMapping(value="/getPoint", method = RequestMethod.GET)
    public ResponseBody<CustPointRecord> getPoint(@RequestParam("custId") String custId,@RequestParam("shopId") String shopId) throws MilkTeaException{

		Logger logger = LoggerFactory.getLogger(UserLoginController.class);
		ResponseBody<CustPointRecord> responseBody = new ResponseBody<CustPointRecord>();
		responseBody.setData(pointService.getPoint(custId, shopId));
		
        
		return responseBody;
    }
    
   


}
