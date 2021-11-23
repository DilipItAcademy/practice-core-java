package com.practice.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Employee> employeeList = createEmployeeList();

		// count of age > 25
		System.out.println("count of age > 25");
		System.out.println("Age > 25 : Count : " + employeeList.stream().filter(emp -> emp.getAge() > 25).count());

		System.out.println("filter all the employee whose age is greater than 20");
		// filter all the employee whose age is greater than 20
		List<String> employeeFilteredList = employeeList.stream().filter(emp -> emp.getAge() > 20)
				.map(Employee::getName).collect(Collectors.toList());

		employeeFilteredList.forEach((name) -> System.out.println(name));

		System.out.println("Find the employee with name “Mary”.");
		// Find the employee with name “Mary”.
		Optional<Employee> employee = employeeList.stream().filter(emp -> emp.getName().equalsIgnoreCase("mary"))
				.findAny();
		if (employee.isPresent()) {
			System.out.println(employee.get());
		}

		// find maximum age of employee?
		System.out.println("find maximum age of employee?");

		OptionalInt age = employeeList.stream().mapToInt(Employee::getAge).max();

		if (age.isPresent()) {
			System.out.println("Maximum age of Employee: " + age.getAsInt());
		}

		// sort all the employee on the basis of age? Use java 8 APIs only
		System.out.println("sort all the employee on the basis of age? Use java 8 APIs only");

		employeeList.sort((e1, e2) -> e1.getAge() - e2.getAge());
		employeeList.forEach(System.out::println);

		// Join the all employee names with “,” using java 8
		System.out.println("Join the all employee names with “,” using java 8");

		List<String> employeeNames = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		// join() added in 1.8
		String employeeNamesStr = String.join(",", employeeNames);
		System.out.println("Employees are: " + employeeNamesStr);

		// Find Employees whose location is Hyderabad and Designation is Programmer

		System.out.println("Finding Employees whose location is Hyderabad and Designation is Programmer");
		
		List<Employee> empList2 = createEmployeeList();
		List<String> empNames = empList2.stream()
				.filter(emp -> (emp.getCity() == "Hyderabad" && emp.getDesignation() == "Programmer"))
				.map(Employee::getName).collect(Collectors.toList());
		
		empNames.forEach(System.out::println);

	}

	public static List<Employee> createEmployeeList() {

		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee("John", 21, "Hyderabad", 1700000, "Programmer");
		Employee e2 = new Employee("Martin", 19, "Banglore", 1300000l, "Programmer");
		Employee e3 = new Employee("Mary", 31, "Hyderabad", 2700000l, "Manager");
		Employee e4 = new Employee("Stephan", 18, "Hyderabad", 1000000, "Jr.Programmer");
		Employee e5 = new Employee("Gary", 26, "Banglore", 2100000l, "Jr.Manager");
		Employee e6 = new Employee("Dilip", 21, "Hyderabad", 1900000, "Programmer");

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);

		return employeeList;
	}

}
