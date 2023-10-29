package com.RD.usecases;

import com.RD.application.AdminOrEmployee;
import com.RD.dao.EmployeeDao;
import com.RD.dao.EmployeeDaoImpl;

public class UpdateEmpProfile {
	
	static int id;
	
	public UpdateEmpProfile() {
		
	}
	public UpdateEmpProfile(int id) {
		this.id = id;
	}
	
	public static void updateProfile() {
		
		EmployeeDao ed = new EmployeeDaoImpl();
		String res = ed.updateProfile(id);
		System.out.println(res);
		System.out.println("==================================================");
		if(res.equals("Updated successfully!")) {
			AdminOrEmployee.choice();
		}
		
	}
	
	

}
