package com.da.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

	public static void parseTime() {
		String time = "13:00";
		LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("localTime: " + localTime);
		
		String time1 = "13*00";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
		LocalTime localTime1 = LocalTime.parse(time1, dateTimeFormatter);
		System.out.println("localTime1: " + localTime1);
		
		String time2 = "13*15*34";
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localTime2 = LocalTime.parse(time2, dateTimeFormatter2);
		System.out.println("localTime2: " + localTime2);
		
	}
	
	public static void formatTime() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
		LocalTime localTime = LocalTime.now();
		String formattedTime = localTime.format(dateTimeFormatter);
		System.out.println("formattedTime: " + formattedTime);
	}
	
	public static void main(String[] args) {
		parseTime();
		formatTime();
	}

}
