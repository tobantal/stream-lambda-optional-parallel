package com.da.functionalInterfaces;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateExample {

    static final Predicate<Integer> p = (i) -> {
        return i%2 == 0;
    };

    static final Predicate<Integer> p1 = (i) -> i%2 == 0;
    static final Predicate<Integer> p2 = (i) -> i%5 == 0;

    public static void predicateAnd(Integer i) {
        System.out.println(p1.and(p2).test(i));
    }

    public static void predicateOr(Integer i) {
        System.out.println(p1.or(p2).test(i));
    }

    public static void predicateNegate(Integer i) {
        System.out.println(p1.negate().test(i));
    }

    public static void main(String[] args) {


        System.out.println(p.test(4));

        IntStream
                .rangeClosed(0,10)
                .parallel()
                .filter((i)-> i%3 == 0)
        .forEach(i-> System.out.println(i));

        predicateAnd(100);
        predicateOr(15);
        predicateNegate(13);
    }

}
