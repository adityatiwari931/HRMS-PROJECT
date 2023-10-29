package com.RD.usecases;

import java.util.List;

import com.RD.bean.Leave;
import com.RD.dao.AdminDao;
import com.RD.dao.AdminDaoImpl;
import com.RD.exception.LeaveException;

public class GetAllLeaves {

	
	public void getAllLeaves() {
		AdminDao ad = new AdminDaoImpl();
	
		try {
			List<Leave> list = ad.getAllLeavesRequest();
			
			for(Leave l : list) {
				System.out.println("Leave Number Is          :      "+l.getLeaveNum());
				System.out.println("Employee Id Is           :      "+l.getEmpId());
				System.out.println("Employee Name Is         :      "+l.getName());
				System.out.println("Leave Duration In Days   :      "+l.getDuration());
				System.out.println("Leave Reason             :      "+l.getReason());
				System.out.println("=================================================");
			}
			
		} catch (LeaveException e) {
			System.out.println(e.getMessage());
			System.out.println("==================================================");
		}
	
	}
	
}
