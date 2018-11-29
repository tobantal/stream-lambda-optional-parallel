package com.da.methodreference;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionMethodReferenceExample {

    static UnaryOperator<String> toUpperCaseLambda = s -> s.toUpperCase();

    static UnaryOperator<String> toUpperCaseLReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCaseLambda.apply("java8"));

        System.out.println(toUpperCaseLReference.apply("java8"));
    }
}
