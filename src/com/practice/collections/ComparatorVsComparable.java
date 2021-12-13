package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorVsComparable {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(111, "Adele", "Los Angeles"));
		employees.add(new Employee(141, "Aria", "Chicago"));
		employees.add(new Employee(121, "Ally", "Houston"));
		employees.add(new Employee(131, "Paul", "New York"));

		
		// Sorting Based On Employee ID
		System.out.println("Sorting Based On Employee ID");
		Collections.sort(employees, new EmpIdSort());
		employees.forEach(System.out::println);
		
		// Sorting Based On Employee Name
		System.out.println("Sorting Based On Employee Name");
		Collections.sort(employees, new EmpNameSort());
		employees.forEach(System.out::println);
		
		// Sorting Based On Employee Address
		System.out.println("Sorting Based On Employee Address");
		Comparator<Employee> addressSort = (emp1, emp2) -> emp1.getAddress().compareTo(emp2.getAddress());
		Collections.sort(employees, addressSort);
		employees.forEach(System.out::println);
		
		

	}

}

class EmpIdSort implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		/*
		 * if (emp1.getEmp_id() == emp2.getEmp_id()) { return 0; } else if
		 * (emp1.getEmp_id() > emp2.getEmp_id()) { return 1; } return -1;
		 */

		return emp1.getEmp_id() - emp2.getEmp_id();

	}

}

class EmpNameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		return emp1.getName().compareTo(emp2.getName());

	}

}
