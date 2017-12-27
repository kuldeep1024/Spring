package com.sp.test2.sender;

import com.sp.test2.comm.Messaging;

public class Communication {
	
	private Messaging activeMQ;

	/*
	 * DI via Setter
	 */
	public void setActiveMQ(Messaging activeMQ) {
		System.out.println("test 2 : setter called");
		this.activeMQ = activeMQ;
	}

	/*
	 * DI via Constructor Injection
	 */
	public Communication(Messaging activeMQ) {
		System.out.println("test 2 : constructor  called");
		this.activeMQ = activeMQ;
	}

	public Communication() {
	}

	public void communicate() {
		activeMQ.sendMessage();
	}
}
