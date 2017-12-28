package com.journaldev.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.journaldev.spring.model.Employee;

public class EmployeeService  {

	private Employee employee;
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}
	
	@PostConstruct
	void init(){
		System.out.println("@PostConstruct");
	}
	
	@PreDestroy
	void destory(){
		System.out.println("@PreDestroy");
	}
}
