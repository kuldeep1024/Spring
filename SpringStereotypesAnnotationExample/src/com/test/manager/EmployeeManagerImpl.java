package com.test.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.EmployeeDAO;
import com.test.model.EmployeeDTO;

@Service ("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager
{
    @Autowired
    EmployeeDAO dao;
     
    public EmployeeDTO createNewEmployee() throws Exception
    {
        return dao.createNewEmployee();
    }

	@Override
	public void checkTransactionl() throws Exception {
		  dao.checkTransactionl();
	}
}
