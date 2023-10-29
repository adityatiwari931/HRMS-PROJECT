package com.RD.usecases;

import java.util.List;

import com.RD.bean.Employee;
import com.RD.dao.AdminDao;
import com.RD.dao.AdminDaoImpl;
import com.RD.exception.EmployeeException;

public class GetAllEmployee {

	public void allEmp() {
		
		AdminDao ad = new AdminDaoImpl();
		
		try {
			List<Employee> list = ad.getAllEmployees();
			
			for(Employee e : list) {
				
				System.out.println("Employee Id Is                    :       "+e.getEmpId());
				System.out.println("Employee Name Is                  :       "+e.getEmpName());
				System.out.println("Employee Working In Deparment     :       "+e.getDeptId());
				System.out.println("Employee Salary Is                :       "+e.getEmpSalary());
				System.out.println("Employee Role Is                  :       "+e.getEmpRole());
				System.out.println("========================================================");
				
			}
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
			System.out.println("==================================================");
		}
		
		
		
		
	}
	
	
	
}
