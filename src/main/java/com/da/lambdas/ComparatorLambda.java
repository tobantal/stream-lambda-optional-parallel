package com.da.lambdas;

import java.util.Comparator;

public class ComparatorLambda {

    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.printf("Comparable result is: %d\n", comparator.compare(3, 2));

        Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);
        System.out.printf("Comparable result is: %d\n", comparatorLambda.compare(3, 2));

        Comparator<Integer> comparatorNaturalOrder = Comparator.naturalOrder();
        System.out.printf("Comparable result is: %d\n", comparatorNaturalOrder.compare(3, 2));
    }
}
