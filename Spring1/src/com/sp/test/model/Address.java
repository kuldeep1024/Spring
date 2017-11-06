package com.sp.test.model;

public class Address {
	private String street;
	private String city;
	private String country;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [street=");
		builder.append(street);
		builder.append(", city=");
		builder.append(city);
		builder.append(", country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
	}	
}
