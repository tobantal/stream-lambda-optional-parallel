package com.da.functionalInterfaces;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) ->
                System.out.printf("%s: %s\n", name, activities);
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }


    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.printf("a: %s, b: %s\n", a, b);
        };
        biConsumer.accept("java7", "java8");

        BiConsumer<Integer, Integer> multiplicationBiConsumer = (a,b) -> {
            System.out.printf("%d*%d=%d\n", a, b, a*b);
        };
        multiplicationBiConsumer.accept(13, 7);

        BiConsumer<Integer, Integer> divisionBiConsumer = (a,b) -> {
            System.out.printf("%d/%d=%d\n", a, b, a/b);
        };
        divisionBiConsumer.accept(199, 7);

        multiplicationBiConsumer.andThen(divisionBiConsumer).accept(10, 5);

        nameAndActivities();
    }
}
