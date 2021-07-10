package com.sharyu.javabasics.streams;

public class Employee {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	private String name;
	private Integer salary;

}
