package com.test.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.EmpService;

public class MainClass {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmpService employeeService = ctx.getBean("employeeService", EmpService.class);

/*		System.out.println("=======================");
		System.out.println(employeeService.getEmp().getName());
		System.out.println("=======================");
		System.out.println(employeeService.getEmp().getAge());
		System.out.println("=======================");
		System.out.println(employeeService.getEmp().getAddress());
		System.out.println("=======================");
		
		*/
		

		//employeeService.exp();

		try {
			employeeService.exp();
		} catch (Exception e) {
			System.out.println("catch block");
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
		
		ctx.close();
	}

}
