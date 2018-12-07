package com.da.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant.getEpochSecond());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {
        }
        System.out.println(Instant.now().getEpochSecond());

        System.out.println(Instant.ofEpochSecond(0));

        Instant instant1 = Instant.now();
        Duration duration = Duration.between(instant, instant1);
        System.out.println(duration.getNano());
    }
}
