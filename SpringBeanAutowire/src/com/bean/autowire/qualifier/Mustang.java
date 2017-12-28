package com.bean.autowire.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Mustang implements Car {

	@Override
	public void carDetail() {
		System.out.println("Mustang");
	}

}
