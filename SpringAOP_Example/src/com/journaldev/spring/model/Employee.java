package com.journaldev.spring.model;

import com.journaldev.spring.aspect.Loggable;

public class Employee {

	private String name;
	
	public String getName() {
		System.out.println("inside getName()");
		return name;
	}

	@Loggable
	public void setName(String nm) {
		System.out.println("inside setName(String name)");
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}
	
}
