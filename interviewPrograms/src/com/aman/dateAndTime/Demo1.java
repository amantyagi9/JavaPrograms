package com.aman.dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Demo1 {

	public static void main(String[] args) {
		
		// LocalDate
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		System.out.println(LocalDate.of(2016, 8, 27));
		System.out.println(LocalDate.parse("2017-07-22"));
		System.out.println(LocalDate.now().plusDays(1));
		System.out.println(LocalDate.now().minus(1, ChronoUnit.MONTHS));
		
		DayOfWeek dayOfWeek = LocalDate.parse("2016-08-11").getDayOfWeek();
		System.out.println(dayOfWeek);
		System.out.println(LocalDate.now().getDayOfWeek());

		int d = LocalDate.parse("2016-06-12").getDayOfMonth();
		System.out.println(d);
		
		boolean leapYear = LocalDate.now().isLeapYear();
		System.out.println(leapYear);
		
		boolean isBefore = LocalDate.parse("2016-06-12")
				  .isBefore(LocalDate.parse("2016-06-11"));
		System.out.println(isBefore);
		
		boolean isAfter = LocalDate.parse("2016-06-12")
				  .isAfter(LocalDate.parse("2016-06-11"));
		System.out.println(isAfter);
		
		
		LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
		System.out.println(beginningOfDay);
		
		LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
		  .with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(firstDayOfMonth);
	}

}
