package com.da.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.LongStream;

public class ParallelStreamExample {
    
    
    public static long checkPerformanceResult(
	    Supplier<Long> supplier, int numberOfTimes) {
	long start = System.currentTimeMillis();
	for(int i=0; i<numberOfTimes; i++) {
	    supplier.get();
	}
	return System.currentTimeMillis()-start;
    }
    
    public static long sumSequentialStream() {
	return LongStream
		.rangeClosed(1,1000000)
		.sum();
    }
    
    public static long sumParallelStream() {
	return LongStream
		.rangeClosed(1,1000000)
		.parallel()
		.sum();
    }

    public static void main(String[] args) {
	System.out.println(Runtime.getRuntime().availableProcessors());
	System.out.println(checkPerformanceResult(ParallelStreamExample::sumSequentialStream,20));
	System.out.println(checkPerformanceResult(ParallelStreamExample::sumParallelStream,20));
	

    }

}
