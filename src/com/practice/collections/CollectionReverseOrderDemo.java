package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortByEmpId implements Comparator<Employee> {

    // Initializing the compare method in ascending order of employee id
    @Override
    public int compare(Employee emp1, Employee emp2) {
	return emp1.getEmp_id() - emp2.getEmp_id();
    }
}

public class CollectionReverseOrderDemo {

    public static void main(String[] args) {

	ArrayList<Employee> employees = new ArrayList<>();
	employees.add(new Employee(111, "Adele", "Los Angeles"));
	employees.add(new Employee(141, "Aria", "Chicago"));
	employees.add(new Employee(121, "Ally", "Houston"));
	employees.add(new Employee(131, "Paul", "New York"));

	System.out.println("\nEmployees sorted by employee id : Descending Order");

	// Sorting employees in descending order of employee id using a Comparator that
	// is inverse of SortByEmpId()
	Comparator<Employee> empIdComp = Collections.reverseOrder(new SortByEmpId());
	Collections.sort(employees, empIdComp);

	for (Employee emp : employees)
	    System.out.println(emp);

	System.out.println("\nEmployees sorted by employee Name : Descending Order");

	// Java 8 Format:

	//Sorting employees in descending order of employee Name
	Comparator<Employee> compareByName = (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName());
	Collections.sort(employees, compareByName.reversed());
	employees.forEach(System.out::println);

	//Sorting employees in descending order of employee Address
	System.out.println("\nEmployees sorted by employee Address : Descending Order");
	Comparator<Employee> compareByAddress = (Employee o1, Employee o2) -> {
	    //We can Write Code Block Here
	    return o1.getAddress().compareTo(o2.getAddress());
	};

	Collections.sort(employees, compareByAddress.reversed());
	employees.forEach(System.out::println);

    }

}
