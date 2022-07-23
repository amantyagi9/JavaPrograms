package com.aman.dateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Demo6 {

	public static void main(String[] args) {
		
		// Compatibility With old Date and Calendar
		
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		System.out.println(d);
				
		LocalDateTime dateTime1 =
							 LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
		LocalDateTime dateTime2 = 
							 LocalDateTime.ofInstant(c.toInstant(), ZoneId.systemDefault());
				
		System.out.println(dateTime1);
		System.out.println(dateTime2);
	}

}
