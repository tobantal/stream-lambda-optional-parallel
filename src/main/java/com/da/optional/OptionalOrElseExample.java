package com.da.optional;

import com.da.data.StudentDataBase;
import com.da.data.Student;

import java.util.Optional;


public class OptionalOrElseExample {

    public static String optionalOrElse() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //studentOptional = Optional.empty();
        return studentOptional.map(Student::getName).orElse("Default");
    }

    public static String optionalOrElseGet() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //studentOptional = Optional.empty();
        return studentOptional.map(Student::getName).orElseGet(()->"Default");
    }
    
    public static String optionalOrElseThrow() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional = Optional.empty();
        return studentOptional.map(Student::getName).orElseThrow(()->new IllegalArgumentException());
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }
}
