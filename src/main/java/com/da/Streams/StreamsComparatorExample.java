package com.da.Streams;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    //private static Comparator<Student> studentComparator = (a,b)-> a.getName().compareTo(b.getName());
    private static Comparator<Student> studentComparator = Comparator.comparing(Student::getName);

    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                //.sorted(studentComparator)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        sortStudentsByName().forEach(System.out::println);
    }
}
