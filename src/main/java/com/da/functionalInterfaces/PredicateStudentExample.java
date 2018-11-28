package com.da.functionalInterfaces;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static final Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static final Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    public static void filterStudentByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.or(p2).test(student)) {
                System.out.println(student);
            }
        }));
        //System.out.println(studentList);
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
    }
}
