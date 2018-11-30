package com.da.methodreference;

import java.util.function.Predicate;
import com.da.data.Student;
import com.da.data.StudentDataBase;

public class RefactorMethodReferenceExample {


    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    private static boolean greaterThanGradeLevel(Student s) {
        return s.getGradeLevel()>=3;
    }

    public static void main(String[] args) {

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }

}
