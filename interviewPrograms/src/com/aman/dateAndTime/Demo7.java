package com.aman.dateAndTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Demo7 {

	public static void main(String[] args) {
		
		// Date and Time Formatting
		
		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
		System.out.println(localDateTime);
		String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println(localDateString);
		String dateStr1 = localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(dateStr1);
		
		System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
		System.out.println(localDateTime
							.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
							  .withLocale(Locale.UK)));
		
		
	}

}
