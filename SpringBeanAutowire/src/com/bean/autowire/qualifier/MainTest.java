package com.bean.autowire.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config_qualifier.xml");
		
		App app= context.getBean(App.class);
		app.shoeCar();
		
	}

}
