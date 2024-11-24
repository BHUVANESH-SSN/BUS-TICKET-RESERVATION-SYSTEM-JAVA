package com.bhuvi.dao;

import java.util.List;

import com.bhuvi.classes.Admin;
import com.bhuvi.classes.Booking;
import com.bhuvi.classes.Bus;
import com.bhuvi.classes.ContactPerson;
import com.bhuvi.exceptions.AdminException;
import com.bhuvi.exceptions.BookingException;
import com.bhuvi.exceptions.BusException;
import com.bhuvi.exceptions.ContactPersonException;

public interface AdminDao {
	public Admin loginAdmin(String username,String password)throws AdminException;
	public List<Bus> getBusData()throws BusException;
	public Booking getSeatConfirmation(int customerid) throws BookingException;
	public ContactPerson getContactPerson(int busid) throws ContactPersonException;
}
