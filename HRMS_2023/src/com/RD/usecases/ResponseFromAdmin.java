package com.RD.usecases;

import com.RD.dao.EmployeeDao;
import com.RD.dao.EmployeeDaoImpl;

public class ResponseFromAdmin {

	int id;
	
	public ResponseFromAdmin() {
	
	}
	public ResponseFromAdmin(int id) {
		super();
		this.id = id;
	}
	
	public void response() {
		
		EmployeeDao ed = new EmployeeDaoImpl();
		String res = ed.leaveResponse(id);
		System.out.println(res);
		System.out.println("==================================================");
	}
	
	
}
