package com.RD.usecases;

import java.util.List;

import com.RD.bean.Department;
import com.RD.dao.AdminDao;
import com.RD.dao.AdminDaoImpl;
import com.RD.exception.DepartmentException;

public class GetAllDepartments {

	public void getAllDept() {
		
		AdminDao ad = new AdminDaoImpl();
		
		
		try {
			List<Department> list = ad.getAllDepartments();
			
			if(list.size() != 0) {
				
				for(Department d : list) {
					
					System.out.println("Department Id Is          :        "+ d.getDepId());
					System.out.println("Department Name Is        :        "+d.getDepName());
					System.out.println("==================================================");
					
				}
				
				
			}
			
		} catch (DepartmentException e) {
			
			System.out.println(e.getMessage());
			System.out.println("==================================================");
		}
		
	}
	

	
	
	
}
