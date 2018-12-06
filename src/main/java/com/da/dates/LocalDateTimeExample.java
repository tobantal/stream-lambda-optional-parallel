package com.da.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LocalDateTimeExample {
    
    static Supplier<LocalDateTime> timer = () -> LocalDateTime.now();
    static Consumer<LocalDateTime> printer = System.out::println;

    public static void main(String[] args) {
	
	printer.accept(timer.get());
	
	printer.accept(LocalDateTime.of(2018, 12, 6, 19, 17, 5, 6359845));
	
	printer.accept(LocalDateTime.of(
		LocalDate.now(), LocalTime.now().plusMinutes(17)));
	
	System.out.println(LocalDateTime.now().getHour());
	System.out.println(LocalDateTime.now().getDayOfMonth());
	System.out.println(LocalDateTime.now().get(ChronoField.DAY_OF_WEEK));
	System.out.println(LocalDateTime.now().plusHours(5).minusDays(2));
	
	System.out.println(LocalDateTime.now().withDayOfMonth(6).getDayOfWeek());

    }

}
