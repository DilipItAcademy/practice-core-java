package com.practice.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class EmployeeOperationsDemo {

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
				.filter(emp -> (emp.getCity() == "Hyderabad" && emp.getDepartment() == "HR"))
				.map(Employee::getName).collect(Collectors.toList());

		empNames.forEach(System.out::println);

	}

	public static List<Employee> createEmployeeList() {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0,"Hyderabad"));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0,"Hyderabad"));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0,"Hyderabad"));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0,"Pune"));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0,"Pune"));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0,"Pune"));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0,"Pune"));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0,"Pune"));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0,"Hyderabad"));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5,"Hyderabad"));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0,"Banglore"));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0,"Banglore"));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0,"Banglore"));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5,"Banglore"));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0,"Banglore"));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0,"Hyderabad"));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0,"Pune"));

		return employeeList;
	}

}
