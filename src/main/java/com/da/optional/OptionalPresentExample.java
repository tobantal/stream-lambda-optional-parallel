package com.da.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
	Optional<String> optional = Optional.ofNullable("Hello");
	//optional = Optional.empty();
	System.out.println(optional.isPresent());
	optional.ifPresent(System.out::println);

    }

}
