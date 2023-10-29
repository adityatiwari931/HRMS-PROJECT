package com.RD.usecases;

import com.RD.dao.EmployeeDao;
import com.RD.dao.EmployeeDaoImpl;

public class ApplyForLeave {

	int id;
	
	public ApplyForLeave() {
	
	}
	
	public ApplyForLeave(int id) {
		super();
		this.id = id;
	}
	
	public void forLeave() {
		
		EmployeeDao ed = new EmployeeDaoImpl();
		String res = ed.applyForLeave(id);
		System.out.println(res);
		System.out.println("==================================================");
		
	}
	
	
	
}
