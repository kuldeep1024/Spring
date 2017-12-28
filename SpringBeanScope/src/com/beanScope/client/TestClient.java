package com.beanScope.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beanScope.service.MyService;

public class TestClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MyService s1 = context.getBean("service",MyService.class);
		MyService s2 = context.getBean("service",MyService.class);

		MyService s3 = context.getBean("service_protype",MyService.class);
		MyService s4 = context.getBean("service_protype",MyService.class);

		MyService s5 = context.getBean("service",MyService.class);
		MyService s6 = context.getBean("service2",MyService.class);
		

		System.out.println("************Singlton**************");
		System.out.println("s1 hashcode "+s1.hashCode());
		System.out.println("s2 hashcode "+s2.hashCode());
		System.out.println("************Prototype**************");
		System.out.println("s3 hashcode "+s3.hashCode());
		System.out.println("s4 hashcode "+s4.hashCode());
		System.out.println("******Singlton with Two diff bean def********");
		System.out.println("s5 hashcode "+s5.hashCode());
		System.out.println("s6 hashcode "+s6.hashCode());

	}

}
