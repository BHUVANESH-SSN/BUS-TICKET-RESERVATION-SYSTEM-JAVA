package com.bhuvi.usecases;

import java.util.Scanner;

import com.bhuvi.classes.Admin;
import com.bhuvi.dao.AdminDao;
import com.bhuvi.dao.AdminImpl;
import com.bhuvi.exceptions.AdminException;

public class AdminLogin {

	public static Boolean login() {
		Boolean status=false;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		AdminDao dao = new AdminImpl();
		
		try {
			Admin admin= dao.loginAdmin(uname, pass);
			status=true;
			System.out.println("============================================");
	 		System.out.println("‖               Welcome Admin               ‖");
	 		
	 	
		}catch (AdminException e) {
			System.out.println(e.getMessage());
		}
		return status;
	}
}
