package com.test.dao;

import com.test.model.EmployeeDTO;

public interface EmployeeDAO {
	public EmployeeDTO createNewEmployee() throws Exception;
	public void checkTransactionl() throws Exception;
}
