package com.da.Streams;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.Consumer;

public class SteamsFlatMapExample {
    static final Consumer<List<String>> printConsumer = (s) -> System.out.println(">>>>> " + s);

private static List<String> printStudentActivities() {
    return StudentDataBase.getAllStudents().stream() //Stream<Student>
            .map(Student::getActivities) //Stream<List<String>>
            //.peek(printConsumer)
            .flatMap(List::stream) //Stream<String>
            .distinct()
            .sorted()
            .map(String::toUpperCase)
            .collect(toList());
}
    private static long countStudentActivities() { // short but has more actions
    return (long) printStudentActivities().size();
    }

    private static long countStudentActivities2() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println("countStudentActivities: " + countStudentActivities());
        System.out.println("countStudentActivities2: " + countStudentActivities2());
    }
}
