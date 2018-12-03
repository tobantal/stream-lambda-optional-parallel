package com.da.Streams;

import com.da.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.9);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=3.9);
    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=3.9);
    }

    public static void main(String[] args) {
        System.out.println(allMatch());
        System.out.println(anyMatch());
        System.out.println(noneMatch());
    }
}
