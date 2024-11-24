
package com.bhuvi.dao;

import com.bhuvi.classes.Booking;
import com.bhuvi.classes.Customer;
import com.bhuvi.exceptions.BookingException;
import com.bhuvi.exceptions.CustomerException;

public interface CustomerDao {
	public String registerCustomer(Customer customer);
	public Customer loginCustomer(String username,String password)throws CustomerException;
	public Booking bookTicket(String source,String destination) throws BookingException;
	public Boolean cancelTicket(int bookingId) throws BookingException;
	
}
	