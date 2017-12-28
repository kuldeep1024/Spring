package com.bean.autowire.qualifier;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class App {
	
	//@Autowired
	@Resource
	@Qualifier("BMW")
	private Car car;

	public void setCar(Car car) {
		this.car = car;
	}

	public void shoeCar(){
		car.carDetail();
	}
	
}
