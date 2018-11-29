package com.da.functionalInterfaces;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    private static final Predicate<Student> p1 = s -> s.getGradeLevel()>=3;
    private static final Predicate<Student> p2 = s -> s.getGpa()>=3.9;

    private static final BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;

    private static final BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
        System.out.printf("%s: %s\n", name, activities);
    };

    private static final Consumer<Student> studentConsumer = student -> {
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
        /*

        */
    };

    static void printNameAndActivities() {
        StudentDataBase
                .getAllStudents()
                .forEach(student -> studentConsumer.accept(student));
    }

    public static void main(String[] args) {
        printNameAndActivities();

        /*
        Student student = null;
        if(p1.and(p2).test(student)) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
        */
    }
}
