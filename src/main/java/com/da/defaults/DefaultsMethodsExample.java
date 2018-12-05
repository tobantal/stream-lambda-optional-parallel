package com.da.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.da.data.Student;
import com.da.data.StudentDataBase;

public class DefaultsMethodsExample {
    
    public static void main(String[] args) {
	List<String> stringList = 
		StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.collect(Collectors.toList());
	System.out.println(stringList);
	
	stringList.sort(Comparator.naturalOrder());
	//Collections.sort(stringList);
	System.out.println(stringList);
	
	stringList.sort(Comparator.reverseOrder());
	System.out.println(stringList);
    }

}
