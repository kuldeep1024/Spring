package com.test.service;

import com.test.model.Emp;

public class EmpService {
	private Emp emp;

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	public void exp() throws Exception{
		throw new Exception();
	}
}
