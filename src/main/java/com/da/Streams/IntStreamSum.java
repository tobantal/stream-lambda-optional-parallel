package com.da.Streams;

import java.util.stream.IntStream;

public class IntStreamSum {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 3).map(i->i*i).parallel().sum();
        System.out.printf("sum=%d", sum);
    }
}
