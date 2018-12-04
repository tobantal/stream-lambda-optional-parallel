package com.da.codograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        String CAT = ",12,усои:55,67";
        List<String> categories = Arrays.stream(CAT.split(","))
                .filter(s->!s.isEmpty()).map(String::trim).collect(Collectors.toList());

        Predicate<String> predicate = codogram->false;
        for(String category : categories) {
            predicate = predicate.or(codogram -> codogram.startsWith("?+" + category));
        }
        List<String> codograms = Arrays.asList("?+12ABC=?","?+усои:55xyz=?","?+74abc=?","?+усои:55uiq=?","?+67xyz=?","?+999zzz=?");

        codograms = codograms.stream().filter(predicate).collect(Collectors.toList());
        codograms.forEach(System.out::println);
    }
}
