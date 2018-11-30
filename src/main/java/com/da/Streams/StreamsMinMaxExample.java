package com.da.Streams;

import java.util.*;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> list) {
        return list.stream()
                //.max(Comparator.comparing(Comparator.naturalOrder()))
                .reduce(Integer.MIN_VALUE, Integer::max);
    }

    public static int findMinValue(List<Integer> list) {
        return list.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> list) {
        return list.stream().reduce(Integer::max);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> list) {
        return list.stream().reduce(Integer::min);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,9,10);
        System.out.println(findMaxValue(list));
        System.out.println(findMinValue(list));
        //System.out.println(findMaxValue(null));
        //System.out.println(findMinValue(null));

        findMaxValueOptional(list).ifPresent(System.out::println);
        findMaxValueOptional(new ArrayList<>()).ifPresent(System.out::println);

        findMinValueOptional(list).ifPresent(System.out::println);
        findMinValueOptional(new ArrayList<>()).ifPresent(System.out::println);
    }
}
