package com.da.streamsTerminal;

import com.da.data.Student;
import com.da.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {
        
        List<String> namesList = StudentDataBase.getAllStudents().stream()
                .map(Student::getName).collect(Collectors.toList());
        System.out.println(namesList);
        
        Set<String> namesSet = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toSet()));
        System.out.println(namesSet);
                
    }
}
