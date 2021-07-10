package com.sharyu.javabasics.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class SortEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Sharyu", 16000));
		employeeList.add(new Employee("Sharja", 20000));
		employeeList.add(new Employee("Sha", 5000));

		List<Employee> filteredList = employeeList.stream()
				.filter(e -> (e.getName().startsWith("S") && e.getSalary() > 10000)).collect(Collectors.toList());
		for (Employee emp : filteredList) {
			System.out.println(emp.getName());
		}

		// Output is
//		Sharyu
//		Sharja

		List<Double> weights = new ArrayList<Double>();
		weights.add(51.11);
		weights.add(74.33);

		double total = weights.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println(total);
		
		double average = weights.stream().mapToDouble(Double::doubleValue).average().orElse(0);
		System.out.println(average);


	}

}
