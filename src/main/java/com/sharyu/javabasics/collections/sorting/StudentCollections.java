package com.sharyu.javabasics.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCollections {

	public static void main(String[] args) {
		System.out.println("How to sort wrapper classes ArrayLists");
		List<Integer> data = new ArrayList<>(List.of(101,2,2000));
		Collections.sort(data);
		System.out.println(data);
		// why sort works on wrapper classes, because each wrapper class implements Comparable interface
		
		List<Student> students = new ArrayList<>(List.of(new Student(1L,"Sharyu"),new Student(2L,"Aman"),new Student(null,"Amandeep")));
		
		System.out.println(students);
		
		// This is java 8 way of defining comparator, wheree every object does not need to implement comparator class
		
		Comparator<Student> comparator = Comparator.comparing(Student::getId, Comparator.nullsFirst(Comparator.reverseOrder()))
                .thenComparing(Student::getName);
		
		// sort does not work on Student class object unless i impelemnt comparable interface before Java 8 now it works :-)
		//Collections.sort(students);
		students.sort(comparator);
		System.out.println(students);

	}

}
