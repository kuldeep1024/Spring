package com.di.xml.consumer;

import com.di.xml.service.MessageService;

public class MyApplication {
	private MessageService service;

	// inject dependency
	public MyApplication() {

	}

	// constructor injection
	public MyApplication(MessageService service) {
		this.service = service;
	}

	// setter injection
	public void setService(MessageService service) {
		this.service = service;
	}

	public boolean processMessaging(String msg, String rec) {
		return service.sendMessage(msg, rec);
	}

}
