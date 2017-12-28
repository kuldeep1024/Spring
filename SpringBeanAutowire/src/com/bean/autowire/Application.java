package com.bean.autowire;

public class Application {

	private AppUser user;

	public AppUser getUser() {
		return user;
	}

	public void setUser(AppUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Application [user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}

}
