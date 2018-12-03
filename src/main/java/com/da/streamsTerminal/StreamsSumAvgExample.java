package com.da.streamsTerminal;

import java.util.stream.Collectors;

import com.da.data.Student;
import com.da.data.StudentDataBase;

public class StreamsSumAvgExample {

    public static int sum() {
	return StudentDataBase.getAllStudents().stream()
	.collect(Collectors.summingInt(Student::getNoteBooks));
    }
    
    public static double average() {
	return StudentDataBase.getAllStudents().stream()
	.collect(Collectors.averagingInt(Student::getNoteBooks));
    }
    
    public static void main(String[] args) {
	System.out.println(sum());
	System.out.printf("avg=%.2f\n",average());
    }

}
