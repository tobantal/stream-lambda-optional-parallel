package com.da.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

	public static void parseLocalDateTimeExample() {
		String dateTime = "2018-04-18T14:33:33";
		LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("localDateTime: " + localDateTime);
		
		String dateTime1 = "2018-04-18T14|33|33";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
		System.out.println("localDateTime1: " + localDateTime1);
		
		String dateTime2 = "2018-04-18abc14|33|33";
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
		LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime2, dateTimeFormatter2);
		System.out.println("localDateTime2: " + localDateTime2);
		
	}
	
	public static void formatLocalDateTimeExample() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy*MM*dd'abc'HH|mm|ss");
		LocalDateTime localDateTime = LocalDateTime.now();
		String formattedDateTime = localDateTime.format(dateTimeFormatter);
		System.out.println("formattedDateTime: " + formattedDateTime);
	}
	
	public static void main(String[] args) {
		parseLocalDateTimeExample();
		formatLocalDateTimeExample();
	}

}
