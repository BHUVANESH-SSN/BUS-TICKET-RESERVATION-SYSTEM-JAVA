package com.bhuvi.usecases;

import java.util.Scanner;

import com.bhuvi.classes.Booking;
import com.bhuvi.dao.CustomerDao;
import com.bhuvi.dao.CustomerImpl;
import com.bhuvi.exceptions.BookingException;

public class BookTicket {

	public static void book() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Source :");
		String source=sc.nextLine();
		System.out.println("Enter Destination :");
		String dest=sc.nextLine();
		
		CustomerDao dao=new CustomerImpl();
		Booking b=new Booking();
		try {
			 b= dao.bookTicket(source, dest);
			 System.out.println("============================================");
			 System.out.println("‖               Ticket Details              ‖");
			 System.out.println("============================================");
			 System.out.println("Booking Id  : "+b.getBkid());
			 System.out.println("Customer Id : "+b.getCid());
			 System.out.println("Bus Id      : "+b.getBid());
			

			}catch(BookingException se) {
				System.out.println(se.getMessage());
			}
		
	}

}
