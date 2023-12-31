package com.RD.application;
import com.RD.checkdetails.Check;
import com.RD.usecases.AddDepartment;
import com.RD.usecases.Addemployee;
import com.RD.usecases.GetAllDepartments;
import com.RD.usecases.GetAllEmployee;
import com.RD.usecases.GetAllLeaves;
import com.RD.usecases.LeaveRespond;
import com.RD.usecases.TransferEmployee;
import com.RD.usecases.UpdateAdminProfile;
import com.RD.usecases.UpdateDepartment;


public class AdminOperations {
	
	String pass;
	String email;
	
	public AdminOperations() {
	
	}

	public AdminOperations(String pass, String email) {
		super();
		this.pass = pass;
		this.email = email;
	}
	
	public void adminOper() {
		
		int choice = Integer.parseInt(Check.checkChoicesForAdmin());
		
		switch (choice) {
		case 1: {
			UpdateAdminProfile uaf = new UpdateAdminProfile(pass, email);
			uaf.updateProfile();
			adminOper();
			break;
		}
		case 2:{
			Addemployee ae = new Addemployee();
			ae.addemp();
			adminOper();
			break;
		}
		case 3:{
			TransferEmployee te = new TransferEmployee();
			te.transferEmp();
			adminOper();
			break;
		}
		case 4:{
			GetAllEmployee gae = new GetAllEmployee();
			gae.allEmp();
			adminOper();
			break;
		}
		case 5:{
			AddDepartment ad = new AddDepartment();
			ad.addDepartment();
			adminOper();
			break;
		}
		case 6:{
			UpdateDepartment ud = new UpdateDepartment();
			ud.updateDept();
			adminOper();
			break;
		}
		case 7:{
			GetAllDepartments gad = new GetAllDepartments();
			gad.getAllDept();
			adminOper();
			break;
		}
		case 8:{
			GetAllLeaves gal = new GetAllLeaves();
			gal.getAllLeaves();
			adminOper();
			break;
		}
		case 9:{
			LeaveRespond lr = new LeaveRespond();
			lr.leaveRespond();
			adminOper();
			break;
		}
		case 10:{
			AdminOrEmployee.choice();
			break;
		}
		
		default:
			System.out.println("Please Press Valid Number");
			System.out.println("==========================");
			adminOper();
			break;
		}
		
		
		
		
		
		
	}
	
	
	

}
