package com.da.dates;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		System.out.println("zoneDateTime: " + zoneDateTime);
		
		System.out.println("zoneOffset: " + zoneDateTime.getOffset());
		
		System.out.println("zone: " + zoneDateTime.getZone());
		
		System.out.println("Available zones: " + ZoneId.getAvailableZoneIds().size());
		ZoneId.getAvailableZoneIds().stream()
									.limit(10)
									.forEachOrdered(System.out::println);
		
		//in the USA available 4 zones: EST, MST, PST, CST
		System.out.println("Chicago CST: " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Detroit EST: " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
		System.out.println("LA PST	: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println("Denver MST: " + ZonedDateTime.now(ZoneId.of("America/Denver")));
		
		System.out.println("ZonedDateTime using clock: " + ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));
		System.out.println("LocalDateTime in Detroit: " + LocalDateTime.now(ZoneId.of("America/Denver")));
		System.out.println("LocalDateTime2 in Detroit: " + LocalDateTime.now(Clock.system(ZoneId.of("America/Denver"))));
		
		System.out.println("ofInstatnt: " + LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
		
		/*
		 * Convert LocalDateTime, instant to ZonedDateTime
		 */
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime: " + localDateTime);
		
		ZonedDateTime zonedDateTime1 = LocalDateTime.now().atZone(ZoneId.of("America/Chicago"));
		System.out.println("zonedDateTime1: " + zonedDateTime1);
		
		ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Detroit"));
		System.out.println("zonedDateTime2: " + zonedDateTime2);
		
		OffsetDateTime offsetDateTime = LocalDateTime.now().atOffset(ZoneOffset.ofHours(-8));
		System.out.println("offsetDateTime: " + offsetDateTime);
				
	}

}
