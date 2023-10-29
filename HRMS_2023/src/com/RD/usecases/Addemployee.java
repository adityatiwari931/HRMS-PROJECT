package com.RD.usecases;

import java.util.Scanner;

import com.RD.bean.Employee;
import com.RD.checkdetails.Check;
import com.RD.dao.AdminDaoImpl;

public class Addemployee {

	public void addemp() {
		
		AdminDaoImpl adi = new AdminDaoImpl();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Name ");
		String name = s.nextLine();
		String salary = Check.checkSalary();
		System.out.println("Enter Employee Role");
		String role = s.nextLine();
		String deptid = Check.checkDeptid();
		String email =  Check.checkEmail();
		String password = Check.checkPassword();
		Employee emp = new Employee(name, salary, role, password, email,deptid);
		String res = adi.addEmployee(emp);
		System.out.println(res);
		System.out.println("==================================================");
		
	
	}
	
}
