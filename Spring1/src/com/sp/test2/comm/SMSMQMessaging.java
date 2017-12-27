package com.sp.test2.comm;

public class SMSMQMessaging implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Message sent from SMS MQ Messaging");
	}

}
