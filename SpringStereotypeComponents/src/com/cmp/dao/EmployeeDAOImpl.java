package com.cmp.dao;

import org.springframework.stereotype.Repository;

import com.cmp.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	public EmployeeDAOImpl(){
		System.out.println("EmployeeDAOImpl");
	}
	@Override
	public Employee getEmp(String name) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setAddress("Delhi");
		emp.setAge("25");
		return emp;
	}

}
