package com.da.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.function.BiConsumer;

public class LocalTimeExample {
    
    static BiConsumer<String, Object> timePrinter = (s,t) -> 
    System.out.printf("%s: %s\n", s, t);
    
    public static void main(String[] args) {
	timePrinter.accept("LocalTime.now()", LocalTime.now());
	
	System.out.println("LocalTime.MAX: " + LocalTime.MAX);
	System.out.println("LocalTime.MIN: " + LocalTime.MIN);
	System.out.println("LocalTime.MIDNIGHT: " + LocalTime.MIDNIGHT);
	System.out.println("LocalTime.NOON: " + LocalTime.NOON);
	
	timePrinter.accept("LocalTime.of(23,33,17,735873498)", 
		LocalTime.of(23,33,17,735873498));
	timePrinter.accept("LocalTime.now().getHour()", LocalTime.now().getHour());
	timePrinter.accept("LocalTime.now().getMinute()", LocalTime.now().getMinute());
	timePrinter.accept("LocalTime.now().get(ChronoField.CLOCK_HOUR_OF_DAY)", 
		LocalTime.now().get(ChronoField.CLOCK_HOUR_OF_DAY));
	
	timePrinter.accept("LocalTime.now().toSecondOfDay()", 
		LocalTime.now().toSecondOfDay());
	
	// Modify values of LocalTime
	timePrinter.accept("LocalTime.now().minusHours(2)", LocalTime.now().minusHours(2));
	timePrinter.accept("LocalTime.now().minus(2,ChronoUnit.HOURS)", 
		LocalTime.now().minus(2,ChronoUnit.HOURS));
	timePrinter.accept("LocalTime.now().with(ChronoField.HOUR_OF_DAY,22)", 
		LocalTime.now().with(ChronoField.HOUR_OF_DAY,22));
	timePrinter.accept("LocalTime.now().with(ChronoField.MINUTE_OF_DAY,777)", 
		LocalTime.now().with(ChronoField.MINUTE_OF_DAY,777));
	timePrinter.accept("LocalTime.now().withMinute(55)", 
		LocalTime.now().withMinute(55));
	
	
    }

}
