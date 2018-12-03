package com.da.streamsTerminal;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.da.data.StudentDataBase;
import com.da.data.Student;

public class StreamsPartioningByExample {

    
    public static void paritioningBy_1() {
	Predicate<Student> gpaPredicate = s->s.getGpa()>=3.8;
	Map<Boolean, List<Student>> partioningMap = 
		StudentDataBase.getAllStudents().stream()
	.collect(Collectors.partitioningBy(gpaPredicate));
	System.out.println(partioningMap);
    }
    
    public static void paritioningBy_2() {
	Predicate<Student> gpaPredicate = s->s.getGpa()>=3.8;
	Map<Boolean, Set<Student>> partioningMap = 
		StudentDataBase.getAllStudents().stream()
	.collect(Collectors.partitioningBy(gpaPredicate,
		Collectors.toSet()));
	System.out.println(partioningMap);
    }
    
    public static void main(String[] args) {
	paritioningBy_1();
	paritioningBy_2();
    }

}
