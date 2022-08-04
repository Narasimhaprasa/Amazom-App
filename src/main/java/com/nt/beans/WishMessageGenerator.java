package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
   // has -a property
	private Date date;
	// for constrcutor Injection
	public WishMessageGenerator(Date date1) {
		System.out.println("WishMessageGenerator.WishMessageGenerator()::1-param constructor");
		this.date = date1;
	}
	 
	// write bussiness logic
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		int hour = date.getHours();
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Goog Evening::"+user;
		else
			return "Good Night::"+user;
	}//generateMessage()
	
}//class
