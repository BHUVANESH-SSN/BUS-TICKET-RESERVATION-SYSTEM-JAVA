package com.bhuvi.usecases;

import java.util.Scanner;
import com.bhuvi.classes.ContactPerson;
import com.bhuvi.dao.AdminDao;
import com.bhuvi.dao.AdminImpl;
import com.bhuvi.exceptions.ContactPersonException;

public class GetContactPerson {

	public static void get() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bus Id :");
		int id=sc.nextInt();
				
		
		
		AdminDao admin = new AdminImpl();
		ContactPerson c=new ContactPerson();
		
		try {
		 c= admin.getContactPerson(id);
		 System.out.println("============================================");	
		 System.out.println("Contact Person Id     :"+c.getCpid());
		 System.out.println("Contact Person name   : "+c.getName());
		 System.out.println("Contact Person mobile : "+c.getMobile());
		

		}catch(ContactPersonException se) {
			System.out.println(se.getMessage());
		}
	}

}
