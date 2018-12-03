package com.da.streamsTerminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.da.data.Student;
import com.da.data.StudentDataBase;

public class StreamsMinByMaxByExample {
    
    public static Optional<Student> minBy_() {
	return StudentDataBase.getAllStudents().stream()
	.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }
    
    public static Optional<Student> maxBy_() {
	return StudentDataBase.getAllStudents().stream()
	.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
	System.out.printf("minBy= %s\n", minBy_().get());
	System.out.printf("maxBy= %s\n", maxBy_().get());

    }

}
