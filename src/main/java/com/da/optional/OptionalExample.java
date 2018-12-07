package com.da.optional;

import com.da.data.StudentDataBase;
import com.da.data.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
        Student student = StudentDataBase.studentSupplier.get();
        //Student student = null;
        if(student!=null) {
            return student!=null ? student.getName() : null;
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty()
        if(studentOptional.isPresent()){
            studentOptional.get(); //Student
            return studentOptional.map(Student::getName); //Optional<String>
        }

        return Optional.empty(); // Represents an optional object with no value
    }

    public static void func1(String str) {
        System.out.println(str);
    }

    public static void func2(String str) {
        System.out.println(str.length());
    }

    public static void main(String[] args) {

        /*String name = getStudentName();
        if(name!=null)
            System.out.println("Length of the student Name : " + name.length());
        else
            System.out.println("Name not found");*/

        Optional<String> stringOptional = getStudentNameOptional();

        if(stringOptional.isPresent()){
            System.out.println("Length of the student Name : " +
                    stringOptional.get().length()); //String which is Student Name
        }else{
            System.out.println("Name not found");
        }

        Optional<List<String>> optional = Optional.ofNullable(new ArrayList<>());
        optional.ifPresent(System.out::println);

        func1("abc");
        func1(null);

        func2("abc");
        func2(null); //  java.lang.NullPointerException
    }
}
