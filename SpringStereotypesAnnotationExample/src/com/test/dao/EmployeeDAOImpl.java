package com.test.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.EmployeeDTO;

@Repository ("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO
{
    public EmployeeDTO createNewEmployee() throws Exception
    {
        EmployeeDTO e = new EmployeeDTO();

        e.setId(1);
        e.setFirstName("Kuldeep");
        e.setLastName("Kunwar");
        return e;
    }
    

    @Transactional
    public int checkId(int i) throws Exception{
    	if(i==10){
    		i++;
    	}else{
    		throw new Exception();
    	}
    	return i;
    }
    public boolean checkId2(int i) throws Exception{
    	if(i==10){
    		throw new Exception();
    	}
    	return true;
    }


   @Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void checkTransactionl() throws Exception {
    	int i=10;
    	int rt=checkId(i);
    	System.out.println(rt);
    	
    	
	}
}
