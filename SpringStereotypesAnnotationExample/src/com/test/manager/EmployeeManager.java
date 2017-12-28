package com.test.manager;

import com.test.model.EmployeeDTO;

public interface EmployeeManager {
	public EmployeeDTO createNewEmployee() throws Exception;
	public void checkTransactionl() throws Exception;
}
