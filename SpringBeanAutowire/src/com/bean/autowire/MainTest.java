package com.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_conf.xml");
		Application app = context.getBean(Application.class);

		System.out.println("Application : "+app);
		
	}

}
