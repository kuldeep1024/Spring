package com.di.anno.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.di.xml.service.MessageService;

@Component
public class MyApplicationAnn {
	
	@Autowired
	private MessageService service;

	public boolean processMessaging(String msg, String rec) {
		return service.sendMessage(msg, rec);
	}

}
