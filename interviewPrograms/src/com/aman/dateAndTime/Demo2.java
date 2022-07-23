package com.aman.dateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Demo2 {

	public static void main(String[] args) {
		
		// LocalTime
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		System.out.println(LocalTime.parse("06:30"));
		System.out.println(LocalTime.of(6, 30));
		System.out.println(LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS));
		System.out.println(LocalTime.parse("06:30").getHour());
		
		System.out.println(LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30")));
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);

	}

}
