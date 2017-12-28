package com.test.model;

public class Emp {
	private String name;
	private String age;
	private String address;
	
	public String getName() {
		System.out.println("**getName**");
		return name;
	}
	public void setName(String name) {
		System.out.println("**setName**");
		this.name = name;
	}
	public String getAge() {
		System.out.println("**getAge**");
		return age;
	}
	public void setAge(String age) {
		System.out.println("**setAge**");
		this.age = age;
	}
	public String getAddress() {
		System.out.println("**getAddress**");
		return address;
	}
	public void setAddress(String address) {
		System.out.println("**setAddress**");
		this.address = address;
	}
	
	
}
