package com.da.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    private static Optional<Integer> limit(List<Integer> list, int n) {
        return list.stream().limit(n).reduce(Integer::max);
    }
    private static Optional<Integer> skip(List<Integer> list, int n) {
        return list.stream().skip(n).reduce(Integer::max);
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,9,10);

        System.out.println(limit(list, 3));
        System.out.println(skip(list, 3));

        System.out.println(limit(list, 100));
        System.out.println(skip(list, 100));
    }
}
