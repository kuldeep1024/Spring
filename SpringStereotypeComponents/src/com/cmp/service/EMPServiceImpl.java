package com.cmp.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.cmp.dao.EmployeeDAO;
import com.cmp.model.Employee;

@Service("EmpSer")
@Lazy
public class EMPServiceImpl implements EMPService {

	@Autowired
	//@Lazy
	private EmployeeDAO dao;

	@Override
	public Employee getEmp(String name) {
		return dao.getEmp(name);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}

	@PostConstruct
	public void init() {
		System.out.println("constructd");
	}
}
