package com.da.Streams;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> studentPreicate = student -> student.getGradeLevel()>=3;
    static Predicate<Student> studentGpaPreicate = student -> student.getGpa()>=3.9;

    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(System.out::println)
                .filter(studentPreicate.and(studentGpaPreicate))
                .peek(student -> System.out.printf("after filtering: %s\n", student))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
