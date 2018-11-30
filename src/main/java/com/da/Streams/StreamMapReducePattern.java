package com.da.Streams;

import com.da.data.Student;
import com.da.data.StudentDataBase;

public class StreamMapReducePattern {

private static int noOfNoteBooks() {
    return StudentDataBase.getAllStudents().stream()  //Stream<Student>
            .filter(student -> student.getGradeLevel()>=3)
            .filter(student -> student.getGender().equals("female"))
            .map(Student::getNoteBooks) //Stream<Integer>
    //.reduce(0,(a,b)->a+b);
            .reduce(0,Integer::sum);
}
    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }
}
