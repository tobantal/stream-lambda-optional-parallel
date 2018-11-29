package com.da.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);


    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
        System.out.println(binaryOperator.apply(3,5));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(Comparator.naturalOrder());
        System.out.println(maxBy.apply(3,5));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(Comparator.naturalOrder());
        System.out.println(minBy.apply(3,5));
    }
}
