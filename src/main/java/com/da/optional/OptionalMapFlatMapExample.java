package com.da.optional;

import java.util.Optional;

import com.da.data.Bike;
import com.da.data.Student;
import com.da.data.StudentDataBase;

public class OptionalMapFlatMapExample {
    
    public static void optionalFilter() {
	Optional<Student> studentOptional = 
		Optional.ofNullable(StudentDataBase.studentSupplier.get());
	studentOptional.filter(s->s.getGpa()>=3.5)
	.ifPresent(System.out::println);
    }
    
    public static void optionalMap() {
	Optional<Student> studentOptional = 
		Optional.ofNullable(StudentDataBase.studentSupplier.get());
	studentOptional
	.filter(s->s.getGpa()>=3.5)
	.map(Student::getActivities)
	.ifPresent(System.out::println);
    }
    
    public static void optionalFlatMap() {
	Optional<Student> studentOptional = 
		Optional.ofNullable(StudentDataBase.studentSupplier.get());
	Optional<String> bikeName = 
	studentOptional.filter(s->s.getGpa()>3.5)
			.flatMap(Student::getBike)
			.map(Bike::getName);
	bikeName.ifPresent(System.out::println);
    }
    
    public static void main(String[] args) {
	optionalFilter();
	optionalMap();
	optionalFlatMap();
    }

}
