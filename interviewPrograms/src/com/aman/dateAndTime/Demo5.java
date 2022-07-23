package com.aman.dateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Demo5 {
	
	public static void main(String[] args) {
		
		// Working With Period and Duration
		
		// Period
		
		LocalDate initialDate = LocalDate.parse("2007-05-10");
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		System.out.println(finalDate);
		
		int n = Period.between(initialDate, finalDate).getDays();
		System.out.println(n);
		
		long n1 = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(n1);
		
		
		
		// Duration
		
		LocalTime initialTime = LocalTime.of(6, 30, 0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		System.out.println(finalTime);
		
		long l = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println(l);
		long l1 = ChronoUnit.SECONDS.between(initialTime, finalTime);
		System.out.println(l1);
		
				
		
	}

}
