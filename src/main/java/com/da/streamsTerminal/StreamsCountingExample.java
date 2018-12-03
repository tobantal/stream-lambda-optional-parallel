package com.da.streamsTerminal;

import com.da.data.StudentDataBase;

public class StreamsCountingExample {

    public static long count() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>= 3.9).count(); //.collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
