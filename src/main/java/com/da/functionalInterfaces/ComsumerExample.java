package com.da.functionalInterfaces;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ComsumerExample {
    static final Consumer<Student> c2 = (s) -> System.out.println(s);
    static final Consumer<Student> c3 = (s) -> System.out.println(s.getName());
    static final Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());

    public static void printStudents() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));
    }

    public static void printNameAndActivitiesUsingCondition() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
                c3.andThen(c4).andThen(c2).accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        //Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        //c1.accept("java8");

        //printStudents();
        //printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
