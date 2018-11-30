package com.da.methodreference;

import com.da.data.StudentDataBase;
import com.da.data.Student;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    // className::methodName
    static Consumer<Student> c1 = System.out::println;

    //className::instanceMethodName
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        //StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
