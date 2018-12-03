package com.da.parallelStreams;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.da.data.Student;
import com.da.data.StudentDataBase;

public class ParallelStreamExample1 {

    private static List<String> sequentialPrintStudentActivities() {
	long start = System.currentTimeMillis();
	List<String> studentActivities =  StudentDataBase.getAllStudents()
		    .stream() //Stream<Student>
	            .map(Student::getActivities) //Stream<List<String>>
	            .flatMap(List::stream) //Stream<String>
	            .distinct()
	            .sorted()
	            .map(String::toUpperCase)
	            .collect(toList());
	long stop = System.currentTimeMillis();
	System.out.println("sequential duration=" + (stop-start));
	return studentActivities;
	}
    
    private static List<String> parallelPrintStudentActivities() {
	long start = System.currentTimeMillis();
	List<String> studentActivities = StudentDataBase.getAllStudents()
		    .parallelStream() //Stream<Student>
	            .map(Student::getActivities) //Stream<List<String>>
	            .flatMap(List::stream) //Stream<String>
	            .distinct()
	            .sorted()
	            .map(String::toUpperCase)
	            .collect(toList());
	long stop = System.currentTimeMillis();
	System.out.println("parallel duration=" + (stop-start));
	return studentActivities;
	}
    
    public static void main(String[] args) {
	sequentialPrintStudentActivities();
	parallelPrintStudentActivities();
    }

}
