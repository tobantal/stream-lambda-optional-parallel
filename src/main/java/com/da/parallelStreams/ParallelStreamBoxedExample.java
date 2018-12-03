package com.da.parallelStreams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class ParallelStreamBoxedExample {
    
    public static long sequentialSum(List<Integer> integerList) {
	long start = System.currentTimeMillis();
	long result = integerList
		.stream()
		.reduce(0, Integer::sum);
	long stop = System.currentTimeMillis();
	System.out.println("Duration sequentialSum: " + (stop-start));
	return result;
    }
    
    public static long parallelSum(List<Integer> integerList) {
	long start = System.currentTimeMillis();
	long result = integerList
		.stream()
		.parallel()
		.reduce(0, Integer::sum);
	long stop = System.currentTimeMillis();
	System.out.println("Duration parallelSum: " + (stop-start));
	return result;
    }

    public static void main(String[] args) {
	List<Integer> integerList = IntStream.rangeClosed(1,10000)
	.boxed()
	.collect(Collectors.toList());
	sequentialSum(integerList);
	parallelSum(integerList);
    }

}
