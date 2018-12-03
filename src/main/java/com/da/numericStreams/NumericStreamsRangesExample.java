package com.da.numericStreams;

import java.util.stream.IntStream;

public class NumericStreamsRangesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println(intStream.count());

        System.out.println(IntStream.rangeClosed(1,50).count());

    }
}
