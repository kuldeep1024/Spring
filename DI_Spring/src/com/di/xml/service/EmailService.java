package com.di.xml.service;

public class EmailService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Email sent to " + rec + " wih msg " + msg);
		return true;
	}

}
