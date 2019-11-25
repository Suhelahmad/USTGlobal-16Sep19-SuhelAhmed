package com.ustglobal.empappp.utill;

import com.ustglobal.dao.EmployeeDAO;
import com.ustglobal.dao.EmployeeDAOImpl;

public class EmployeeManagerr 
{
	private void Employeemanager() 
	{
		
	}
	public static EmployeeDAO getEmployeeDAO()
	{
		
		return new EmployeeDAOImpl();
		
	}
}
