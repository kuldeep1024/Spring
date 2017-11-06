package com.sp.test.model;

public class Student {
	private int r_no;
	private String name;
	private String address;
	private String phone_number;
	
	//address object foe property DI 
	private Address homeAddress;
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	
	public Student() {

	}

	public Student(int r_no, String name, String address, String phone_number) {
		this.r_no = r_no;
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
	}

	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [r_no=");
		builder.append(r_no);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phone_number=");
		builder.append(phone_number);
		builder.append(", homeAddress=");
		builder.append(homeAddress);
		builder.append("]");
		return builder.toString();
	}

}
