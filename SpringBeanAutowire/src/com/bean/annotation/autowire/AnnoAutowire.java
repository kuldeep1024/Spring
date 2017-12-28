package com.bean.annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnoAutowire {

	@Autowired
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
		builder.append("AnnoAutowire [user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}

}
