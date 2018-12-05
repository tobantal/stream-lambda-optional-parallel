package com.da.defaults;

import com.da.data.StudentDataBase;
import com.da.data.Student;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = System.out::println;
    static Comparator<Student> nameComapator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComapator = Comparator.comparing(Student::getGradeLevel);
    static Comparator<Student> doubleComparator = gradeComapator.thenComparing(nameComapator);

    public static void sortByName(List<Student> list) {
        Comparator<Student> nameComapator = Comparator.comparing(Student::getName);
        list.sort(nameComapator);
    }

    public static void sortByGpa(List<Student> list) {
        list.sort(Comparator.comparing(Student::getGpa).reversed());
    }

    public static void comparatorChaining(List<Student> studentList) {
        studentList.sort(doubleComparator);
    }

    public static void sortWithNullValues(List<Student> studentList) {
        //Comparator<Student> studentComparator = Comparator.nullsFirst(nameComapator);
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComapator);
        studentList.sort(studentComparator);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before sort");
        studentList.forEach(studentConsumer);
        //System.out.println(studentList);

        /*
        System.out.println("After sort by Name");
        sortByName(studentList);
        studentList.forEach(studentConsumer);

        System.out.println("After sort by Gpa");
        sortByGpa(studentList);
        studentList.forEach(studentConsumer);

        System.out.println("After comparatorChaining");
        comparatorChaining(studentList);
        studentList.forEach(studentConsumer);
        */
        System.out.println("After sortWithNullValues");
        sortWithNullValues(studentList);
        studentList.forEach(studentConsumer);
    }
}
