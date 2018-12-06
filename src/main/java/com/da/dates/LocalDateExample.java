package com.da.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {

        //Get values
        System.out.println("LocalDate.now(): " + LocalDate.now());

        System.out.println("LocalDate.of(2018,07,17): " + LocalDate.of(2018,07,17));

        System.out.println("LocalDate.ofYearDay(2018, 365): " + LocalDate.ofYearDay(2018, 365));
        System.out.println("LocalDate.ofYearDay(2018, 2): " + LocalDate.ofYearDay(2018, 2));

        System.out.println("LocalDate.now().getYear(): " + LocalDate.now().getYear());
        System.out.println("LocalDate.now().getMonth(): " + LocalDate.now().getMonth());
        System.out.println("LocalDate.now().getMonthValue(): " + LocalDate.now().getMonthValue());
        System.out.println("LocalDate.now().getDayOfMonth(): " + LocalDate.now().getDayOfMonth());
        System.out.println("LocalDate.now().getDayOfYear(): " + LocalDate.now().getDayOfYear());
        System.out.println("LocalDate.now().getDayOfWeek(): " + LocalDate.now().getDayOfWeek());
        System.out.println("LocalDate.now().get(ChronoField.DAY_OF_MONTH): " + LocalDate.now().get(ChronoField.DAY_OF_MONTH));
        System.out.println();

        //Modifying Local Date
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate.now().plusDays(2): " + LocalDate.now().plusDays(2));
        System.out.println("LocalDate.now().minusDays(2): " + LocalDate.now().minusDays(2));
        System.out.println("LocalDate.now().plusMonths(2): " + LocalDate.now().plusMonths(2));

        System.out.println("LocalDate.now().with(ChronoField.YEAR, 2020): " +
                LocalDate.now().with(ChronoField.YEAR, 2020));
        System.out.println("localDate.with(TemporalAdjusters.lastDayOfMonth()) : "
                + localDate.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("localDate.with(TemporalAdjusters.firstDayOfNextMonth()) : "
                + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("localDate.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY)) : " +
                localDate.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY))); // maps to the first friday of the week

        System.out.println("localDate.minus(1, ChronoUnit.YEARS) : "
                + localDate.minus(1, ChronoUnit.YEARS));
        System.out.println("localDate.plus(17, ChronoUnit.DAYS) : "
                + localDate.plus(17, ChronoUnit.DAYS));

        //Additional Support methods
        System.out.println("localDate.isLeapYear() : " + localDate.isLeapYear());
        System.out.println("LocalDate.ofYearDay(2020,1).isLeapYear() : " + LocalDate.ofYearDay(2020,1).isLeapYear());
        System.out.println("localDate.minusYears(2).isLeapYear() : " + localDate.minusYears(2).isLeapYear());
        
        LocalDate localDate1 = LocalDate.now().plus(1, ChronoUnit.DAYS);
        System.out.println("localDate.equals(localdate1): " + localDate.equals(localDate1));     
        System.out.printf("%s.isBefore(%s): %s\n",localDate, localDate1, localDate.isBefore(localDate1));
        System.out.printf("%s.isAfter(%s): %s\n",localDate, localDate1, localDate.isAfter(localDate1));
        
        System.out.println("localDate.isSupported(ChronoUnit.MINUTES): "
        + localDate.isSupported(ChronoUnit.MINUTES));
        
    }
}
