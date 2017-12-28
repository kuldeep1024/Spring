package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.test.manager.EmployeeManager;
import com.test.model.EmployeeDTO;


//@Component // this also work
@Controller("employeeController")
public class EmployeeController {
	
	@Autowired
	EmployeeManager manager;

	public EmployeeDTO createNewEmployee() throws Exception {
		return manager.createNewEmployee();
	}
	public void checkTrans() throws Exception {
		 manager.checkTransactionl();
	}
	
}
