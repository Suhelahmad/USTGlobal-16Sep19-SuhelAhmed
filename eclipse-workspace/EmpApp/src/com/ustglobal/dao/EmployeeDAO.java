package com.ustglobal.dao;

import java.util.List;

import com.ustglobal.eempapp.dto.EmployeeBean;

public interface EmployeeDAO 
{
	public List<EmployeeBean> getAllEmployeeData();
	public EmployeeBean searchEmployeeData(int id);
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);
	
	
}
