package com.bean.autowire.qualifier;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Car{

	@Override
	public void carDetail() {
		System.out.println("BMW");
	}

}
