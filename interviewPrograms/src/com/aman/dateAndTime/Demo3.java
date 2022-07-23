package com.aman.dateAndTime;

import java.time.LocalDateTime;
import java.time.Month;

public class Demo3 {

	public static void main(String[] args) {
		
		// LocalDateTime
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println(LocalDateTime.of(2015, 2, 20, 06, 30));
		System.out.println(LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30));
		System.out.println(LocalDateTime.parse("2015-02-20T06:30:07"));
		
		System.out.println(LocalDateTime.now().plusDays(1));
		System.out.println(LocalDateTime.now().minusHours(2));
		System.out.println(LocalDateTime.now().getMonth());
	}

}
