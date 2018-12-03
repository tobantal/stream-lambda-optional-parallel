package com.da.streamsTerminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.da.data.Student;
import com.da.data.StudentDataBase;

public class StreamsGroupingByExample {

    public static void groupStudentByGender() {
	Map<String, List<Student>> studentsByGender = 
		StudentDataBase.getAllStudents().stream()
	.collect(Collectors.groupingBy(Student::getGender));
	System.out.println(studentsByGender);
    }
    
    public static void customizedGroupingBy() {
	Map<String, List<Student>> studentsByGender = 
		StudentDataBase.getAllStudents().stream()
	.collect(Collectors.groupingBy(
		student->student.getGpa()>=3.8?"OUTSTANDING":"AVERAGE"));
	System.out.println(studentsByGender);
    }
    
    public static void twoLevelGrouping_1() {
	Map<Integer, Map<String, List<Student>>> twoLevelGroupingStudents = 
		StudentDataBase.getAllStudents().stream()
		.collect(
		Collectors.groupingBy(Student::getGradeLevel,
		Collectors.groupingBy(s->s.getGpa()>=3.8?"OUTSTANDING":"AVERAGE")));
	System.out.println(twoLevelGroupingStudents);
    }
    
    public static void twoLevelGrouping_2() {
	Map<String, Integer> twoLevelGroupingStudents = 
		StudentDataBase.getAllStudents().stream()
		.collect(
		Collectors.groupingBy(Student::getGender,
		Collectors.summingInt(Student::getNoteBooks)));
	System.out.println(twoLevelGroupingStudents);
    }
    
    public static void studentsLinkedHashMap() {
	Map<String, Set<Student>> studentsLinkedHashMap = 
		StudentDataBase.getAllStudents().stream()
		.collect(
		Collectors.groupingBy(Student::getName,
			LinkedHashMap::new,
		Collectors.toSet()));
	System.out.println(studentsLinkedHashMap);
    }
    
    public static void calculateTopGpaOptional() {
	Map<Integer, Optional<Student>> studentMapOptional =
		StudentDataBase.getAllStudents().stream().collect(
		Collectors.groupingBy(Student::getGradeLevel,
		Collectors.maxBy(Comparator.comparing(Student::getGpa))));
	System.out.println(studentMapOptional);
    }
    
    public static void calculateTopGpa() {
 	Map<Integer, Student> studentMap =
 		StudentDataBase.getAllStudents().stream().collect(
 		Collectors.groupingBy(Student::getGradeLevel,
 		Collectors.collectingAndThen(
 			Collectors.maxBy(Comparator.comparing(Student::getGpa)),
 			Optional::get)
 		));
 	System.out.println(studentMap);
     }
    
    public static void main(String[] args) {
	groupStudentByGender();
	customizedGroupingBy();
	twoLevelGrouping_1();
	twoLevelGrouping_2();
	studentsLinkedHashMap();
	calculateTopGpaOptional();
	calculateTopGpa();
    }

}
