package com.da.Streams;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    static List<Student> filterStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterStudent().forEach(System.out::println);
    }
}
