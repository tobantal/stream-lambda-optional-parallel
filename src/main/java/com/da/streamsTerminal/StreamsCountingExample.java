package com.da.streamsTerminal;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    public static long count() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>= 3.9).count(); //.collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
