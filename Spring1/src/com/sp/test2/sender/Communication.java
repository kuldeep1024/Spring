package com.sp.test2.sender;

import com.sp.test2.comm.ActiveMQMessaging;

public class Communication {
	private ActiveMQMessaging activeMQ;

	/*
	 * DI via Setter
	 */
	public void setActiveMQ(ActiveMQMessaging activeMQ) {
		System.out.println("test 2 : setter called");
		this.activeMQ = activeMQ;
	}

	/*
	 * DI via Constructor Injection
	 */
	public Communication(ActiveMQMessaging activeMQ) {
		System.out.println("test 2 : constructor  called");
		this.activeMQ = activeMQ;
	}

	public Communication() {
	}

	public void communicate() {
		activeMQ.sendMessage();
	}
}
