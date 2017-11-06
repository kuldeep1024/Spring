package com.di.xml.service;

public class TwitterServices implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter msg sent to " + rec + " wih msg " + msg);
		return true;
	}

}
