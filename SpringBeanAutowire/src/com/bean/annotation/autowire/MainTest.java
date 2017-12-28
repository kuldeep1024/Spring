package com.bean.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_conf.xml");
		AnnoAutowire app = context.getBean(AnnoAutowire.class);

		System.out.println("Application : "+app);
		
	}

}
