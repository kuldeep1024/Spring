package com.sp.test2.comm;

public class ActiveMQMessaging implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Message sent from Active MQ Messaging");
	}

}
