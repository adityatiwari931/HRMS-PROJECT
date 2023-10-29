package com.RD.usecases;

import com.RD.dao.AdminDao;
import com.RD.dao.AdminDaoImpl;

public class LeaveRespond {
	
	public void leaveRespond() {
		
		AdminDao ad = new AdminDaoImpl();
		String res = ad.respontToLeaveRequest();
		System.out.println(res);
		System.out.println("==================================================");
	}

}
