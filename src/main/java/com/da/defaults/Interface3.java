package com.da.defaults;

public interface Interface3  extends Interface2 {

    @Override
    default void methodA() {
        System.out.println("Inside Method A " + Interface3.class);
    }

    @Override
    default void methodB() {
        System.out.println("Inside Method B " + Interface3.class);
    }

    default void methodC() {
        System.out.println("Inside Method C " + Interface3.class);
    }
}
