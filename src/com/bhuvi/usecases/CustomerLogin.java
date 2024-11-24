package com.bhuvi.usecases;

import java.util.Scanner;

import com.bhuvi.classes.Customer;
import com.bhuvi.dao.CustomerDao;
import com.bhuvi.dao.CustomerImpl;
import com.bhuvi.exceptions.CustomerException;

public class CustomerLogin {

	public static Boolean login() {
		Boolean status=false;
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		CustomerDao dao = new CustomerImpl();
		
		try {
			Customer customer= dao.loginCustomer(uname, pass);
			status=true;
			System.out.println("============================================");
	 		System.out.println("‖              Welcome Customer             ‖");
	 	
	 	
		}catch (CustomerException e) {
			System.out.println(e.getMessage());
		}
		return status;
	}

}
