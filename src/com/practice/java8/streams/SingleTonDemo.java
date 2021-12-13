package com.practice.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Singleton {

	private static Singleton obj;

	private Singleton() {

	}

	public static Singleton getInstance() {

		if (obj == null)
			obj = new Singleton();

		return obj;
	}

}

class Employeeee {

	public String name;
	public int salary;
	
	public Employeeee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}








public class SingleTonDemo {

	public static void main(String[] args) { 
		
		
		ArrayList<Employeeee>  employees = new ArrayList<>();
		
		employees.add(new Employeeee("Dilip", 199999999));
		employees.add(new Employeeee("Madhav", 200000));
		
		List<Employeeee>  Salriedemployees = employees.stream().filter(emp -> emp.getSalary() > 200000).collect(Collectors.toList());
		
		Salriedemployees.forEach(System.out::println);
		
		System.out.println(employees.stream().mapToInt(emp -> emp.getSalary()).sum());
		
		
		

	}

}
