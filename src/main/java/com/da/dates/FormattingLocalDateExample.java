package com.da.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

	public static void pareseLocalDate() {
		/*
		 * String to LocalDate
		 */
		String date = "2018-04-28";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("localDate: " + localDate);
		
		LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDate1: " + localDate1);
		
		String date1 = "20180428"; //yyyyMMdd
		LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyyMMdd"));
		//DateTimeFormatter.BASIC_ISO_DATE
		System.out.println("localDate1: " + localDate2);
		
		/*
		 * Custom define date format
		 */
		String date2 = "2018|04|28";
		LocalDate localDate3 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy|MM|dd"));
		System.out.println("localDate1: " + localDate3);
	}
	
	public static void formatLocalDate() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate = LocalDate.now();
		String formattedDate = localDate.format(dateTimeFormatter);
		System.out.println("formattedDate: " + formattedDate);	
	}
	
	public static void main(String[] args) {
		pareseLocalDate();
		formatLocalDate();
	}

}
