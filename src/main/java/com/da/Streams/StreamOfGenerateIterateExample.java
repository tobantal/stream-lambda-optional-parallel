package com.da.Streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {



    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("adam", "dan", "julie");
        stringStream.forEach(System.out::println);

        Stream.iterate(1, x->x*2)
                .limit(30)
                .forEach(System.out::println);

        System.out.println("********************");
        Random random = new Random(83);
        Supplier<Integer> integerSupplier = random::nextInt;
        Stream.generate(integerSupplier)
                .limit(10)
                .forEach(System.out::println);
    }
}
