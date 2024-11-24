package com.bhuvi.usecases;

import java.util.Scanner;

import com.bhuvi.classes.Booking;
import com.bhuvi.dao.AdminDao;
import com.bhuvi.dao.AdminImpl;
import com.bhuvi.exceptions.BookingException;

public class GetSeatConfirmation {

	public static void get() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Booking Id :");
		int id=sc.nextInt();
				
		
		
		AdminDao admin = new AdminImpl();
		Booking b=new Booking();
		
		try {
		 b= admin.getSeatConfirmation(id);
		System.out.println("============================================");	
		System.out.println("Booking Id  : "+b.getBkid());
		System.out.println("Customer Id : "+b.getCid());
		System.out.println("Bus Id      : "+b.getBid());
		

		}catch(BookingException se) {
			System.out.println(se.getMessage());
		}
	}

}
