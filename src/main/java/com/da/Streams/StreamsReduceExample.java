package com.da.Streams;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.*;


public class StreamsReduceExample {

    private static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                //1
                //3
                //5
                //7
                //a=1,b=1 -> 1*1
                //a=previous step=1, b=3 -> 1*3=3
                .reduce(1,(a,b)->a*b);
    }

    private static Optional<Integer> optionalPerformMultiplication(List<Integer> integerList) {
        return integerList.stream()
                //1
                //3
                //5
                //7
                //a=1,b=1 -> 1*1
                //a=previous step=1, b=3 -> 1*3=3
                .reduce((a,b)->a*b);
    }

    private static Optional<Student> getHighestGpaStudent() {
        return StudentDataBase.getAllStudents().stream()
                .max(Comparator.comparing(Student::getGpa));
    }

    private static Optional<Student> getHighestGpaStudent2() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> (s1.getGpa()>s2.getGpa()) ? s1 :s2);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integers));

        Optional<Integer> optionalInteger = optionalPerformMultiplication(integers);
        System.out.println(optionalInteger.isPresent());
        System.out.println(optionalInteger.get());

        optionalInteger.ifPresent(System.out::println);

        Optional<Integer> optionalInteger2 = optionalPerformMultiplication(new ArrayList<>());
        System.out.println(optionalInteger2.isPresent());

        System.out.println(getHighestGpaStudent());

        System.out.println(getHighestGpaStudent2());

    }
}
