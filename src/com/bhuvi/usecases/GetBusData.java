package com.bhuvi.usecases;

import java.util.List;
import com.bhuvi.classes.Bus;
import com.bhuvi.dao.AdminDao;
import com.bhuvi.dao.AdminImpl;
import com.bhuvi.exceptions.BusException;

public class GetBusData {

	public static void get() {
		// TODO Auto-generated method stub
		AdminDao dao = new AdminImpl();
		
		try {
		List<Bus> bus= dao.getBusData();
		
		bus.forEach(b ->{
			System.out.println("============================================");
			System.out.println("Bus ID          : "+b.getBid());
			System.out.println("Bus name        : "+b.getName());
			System.out.println("Bus Type        : "+b.getType());
			System.out.println("Bus source      : "+b.getSource());
			System.out.println("Bus Destination : "+b.getDest());
			System.out.println("Bus Departure   : "+b.getDept());
			System.out.println("Bus Arrival     : "+b.getArrival());
			System.out.println("Total seats     : "+b.getSeat());
			
			
		});
		
		
		
		
		}catch(BusException se) {
			System.out.println(se.getMessage());
		}
	}

}
