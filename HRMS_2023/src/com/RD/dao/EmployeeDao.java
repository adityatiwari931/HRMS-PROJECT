package com.RD.dao;

import com.RD.bean.Employee;
import com.RD.exception.EmployeeException;

public interface EmployeeDao {

	public Employee loginForEmployee(String pass, String email) throws EmployeeException;
	
	public Employee viewProfile(int id) throws EmployeeException;
	
	public String updateProfile(int id);
	
	public String applyForLeave(int id);
	
	public String leaveResponse(int id);
	
}
