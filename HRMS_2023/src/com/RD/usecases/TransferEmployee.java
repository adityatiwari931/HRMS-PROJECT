package com.RD.usecases;

import com.RD.dao.AdminDao;
import com.RD.dao.AdminDaoImpl;

public class TransferEmployee {
	
	
	public void transferEmp() {
		
		AdminDao ad = new AdminDaoImpl();
		System.out.println(ad.transferEmployee());
		System.out.println("==================================================");
		
	}
	

}
