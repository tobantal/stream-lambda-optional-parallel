package com.da.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1,10)
                .boxed() //int -> Integer
        .collect(Collectors.toList());
    }

    //wrapper to primitive type
    public static int unboxing(List<Integer> integerList) {
        return integerList.stream() //wrapper Integer
                .mapToInt(Integer::intValue) // primitive int
                .sum();

    }

    public static void main(String[] args) {
        System.out.println(boxing());
        System.out.println(unboxing(boxing()));
    }
}
