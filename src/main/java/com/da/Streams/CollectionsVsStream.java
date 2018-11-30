package com.da.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStream {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Bob");
        names.remove(0);
        for (String name : names) {
            System.out.println(name);
        }
        Stream<String> stream = names.stream();
        //stream.forEach(System.out::println); // stream can use only once
        stream.forEach(System.out::println);

    }
}
