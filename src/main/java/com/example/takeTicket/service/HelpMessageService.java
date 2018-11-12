package com.example.takeTicket.service;

import java.util.List;



public interface HelpMessageService {
	
	ResponseBean<Integer> insert(HelpMessage helpMessage);
	ResponseBean<Integer> deleteById(Integer id);
	ResponseBean<Integer> update(HelpMessage helpMessage);
	ResponseBean<List<HelpMessage>> selectAll();

}
