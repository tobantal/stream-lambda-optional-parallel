package com.da.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueList {

    public static List<Integer> uniqueList(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2 ,2, 3, 3, 4, 4, 4, 4, 5, 6, 6, 7, 7, 7, 7, 8, 9, 9);

        System.out.println("uniqueList = " + uniqueList(list));
    }
}
