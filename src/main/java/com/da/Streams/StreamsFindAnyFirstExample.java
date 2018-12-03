package com.da.Streams;

import com.da.data.StudentDataBase;
import com.da.data.Student;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }

    public static void main(String[] args) {
       findAnyStudent().ifPresent(System.out::println);
       findFirstStudent().ifPresent(System.out::println);
    }
}
