package com.RD.application;
import java.util.Scanner;
import com.RD.bean.Admin;

import com.RD.bean.Employee;
import com.RD.checkdetails.Check;
import com.RD.dao.AdminDao;
import com.RD.dao.AdminDaoImpl;
import com.RD.dao.EmployeeDao;
import com.RD.dao.EmployeeDaoImpl;
import com.RD.exception.AdminException;
import com.RD.exception.EmployeeException;

public class AdminOrEmployee {

	public static void choice() {
		
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println(" Press \n 1.) Login Admin \n 2.) Login Employee \n 3.) Exit \n==================");
			int value = s.nextInt();
			s.nextLine();
			
			switch(value) {
			
			case 1 : 
			{
				
				String email = Check.checkemail();
				String pass = Check.checkPass();

				AdminDao adi = new AdminDaoImpl();
				Admin admin = adi.loginForAdmin(pass, email);

				System.out.println(" Welcome  --> "+admin.getName());
				System.out.println("================================");
				AdminOperations ao = new AdminOperations(pass,email);
				ao.adminOper();

				break;
			}	
				
			case 2 :
			{	
				
				
				String email = Check.checkemail();
				String pass = Check.checkPass();
				try {
					
					EmployeeDao ed = new EmployeeDaoImpl();
					Employee employee = ed.loginForEmployee(pass, email);

					System.out.println("Welcome --> "+employee.getEmpName() +"   Id is -->  "+employee.getEmpId());
					System.out.println("========================================================================");
					EmployeeOperations eo = new EmployeeOperations(employee.getEmpId());
					eo.employeeOper();
					
				} catch (EmployeeException e) {
					System.out.println(e.getMessage());
					choice();
					
				}
				break;
			}
			case 3 :
			{
				return;
			}
			default :
				System.out.println("Please Press Valid Number");
				System.out.println("=========================");
				choice();
				break;
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("Please Enter Only Number");
			System.out.println("=========================");
			choice();
		}
		
		
	
	
	}
}
