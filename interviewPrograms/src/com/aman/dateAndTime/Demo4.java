package com.aman.dateAndTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
		
		// ZonedDateTime
		
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		allZoneIds.forEach(System.out::println);
		
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");
		System.out.println(zoneId);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(zonedDateTime);
		
		System.out.println(ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]"));
		
		
		
		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset);
		System.out.println(offSetByTwo);
		
	}

}
