package com.da.functionalInterfaces;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FucntionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
        Map<String, Double> stringGradeMap = new HashMap<>();
        students.forEach( student -> {
            if(PredicateStudentExample.p1.test(student))
                stringGradeMap.put(student.getName(), student.getGpa());
        });
        return stringGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
