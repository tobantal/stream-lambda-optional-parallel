package com.da.numericStreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class NumericStreamsAggregateExample {



    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println(sum);

        System.out.println(IntStream.rangeClosed(1,50).max());
        System.out.println(IntStream.rangeClosed(1,50).min());
        IntStream.rangeClosed(1,50).average().ifPresent(System.out::println);
        OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);

        OptionalDouble optionalDoubleEmpty = IntStream.range(1,1).average();
        System.out.println(optionalDoubleEmpty.isPresent() ? optionalDoubleEmpty.getAsDouble() : 0);

    }
}
