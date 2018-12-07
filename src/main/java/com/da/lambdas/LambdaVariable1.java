package com.da.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    static int staticValue = 5;

    public static void main(String[] args) {
    	
        Consumer<Integer> c1 = (i)-> System.out.printf("Value is : %d\n", i);

        int value = 4; //local variable
        Consumer<Integer> c2 = (i)-> {
            //value++; //error
            staticValue++;
            System.out.printf("local variable is : %d\n", value);};

        c1.accept(2);
        c2.accept(2);
    }
}
