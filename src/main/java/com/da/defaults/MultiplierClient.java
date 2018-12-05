package com.da.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);

        int result = multiplier.multiply(integerList);
        System.out.printf("Result is: %d\n",result);

        System.out.printf("Default method size(): %d\n", multiplier.size(integerList));

        System.out.printf("Static method isEmpty(): %b\n", Multiplier.isEmpty(integerList));

    }
}
