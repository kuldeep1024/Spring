package com.journaldev.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.model.Employee;
import com.journaldev.spring.service.EmployeeService;

public class SpringMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		Employee emp = employeeService.getEmployee();
		String name=emp.getName();
		System.out.println("Name : "+name);
		
		employeeService.getEmployee().setName("Pankaj");
		/*
		employeeService.getEmployee().throwException();*/
		
		ctx.close();
	}

}
