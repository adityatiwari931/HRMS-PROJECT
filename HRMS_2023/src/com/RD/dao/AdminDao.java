package com.RD.dao;

import java.util.List;

import com.RD.bean.Admin;
import com.RD.bean.Department;
import com.RD.bean.Employee;
import com.RD.bean.Leave;
import com.RD.exception.AdminException;
import com.RD.exception.DepartmentException;
import com.RD.exception.EmployeeException;
import com.RD.exception.LeaveException;

public interface AdminDao {

	public String updateProfile(Admin admin) throws AdminException;
	
	public Admin loginForAdmin(String pass, String email) throws AdminException;
	
	public String addEmployee(Employee employee);
	
	public String addDepartment(String deptid,String deptName);
	
	public String updateDepartment( String depName);
	
	public String transferEmployee();
	
	public List<Department> getAllDepartments() throws DepartmentException;
	
	public List<Employee> getAllEmployees() throws EmployeeException;
	
	public List<Leave> getAllLeavesRequest() throws LeaveException;
	
	public String respontToLeaveRequest();
	
}
