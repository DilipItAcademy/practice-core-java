package com.practice.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeQuestions {

	public static List<Employee> createEmployeeList() {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0, "Hyderabad"));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0, "Hyderabad"));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0, "Hyderabad"));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0, "Pune"));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0, "Pune"));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0, "Pune"));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0, "Pune"));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0, "Pune"));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0, "Hyderabad"));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5, "Hyderabad"));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0, "Banglore"));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0, "Banglore"));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0, "Banglore"));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5, "Banglore"));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0, "Banglore"));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0, "Hyderabad"));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0, "Pune"));

		return employeeList;
	}

	public static void main(String[] args) {

		List<Employee> employees = createEmployeeList();

		// Reference URL :
		// https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/

		// Highest Salary Employee Details
		Optional<Employee> maxSalaryEmp = employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

		if (maxSalaryEmp.isPresent() && !maxSalaryEmp.isEmpty())
			System.out.println("****** Employee with max salary : " + (maxSalaryEmp.isPresent() ? maxSalaryEmp.get() : "Not Avilable"));

		// First Highest Salary
		OptionalDouble maxSal = employees.stream().mapToDouble(Employee::getSalary).max();
		if (maxSal.isPresent() && !maxSal.isEmpty())
			System.out.println("***** Max Salary Of Organization: " + (maxSal.isPresent() ? maxSal.getAsDouble() : "Not Avilable"));

		// sort all the employee on the basis of age
		System.out.println("sort all the employee on the basis of age? Use java 8 APIs only");
		employees.sort((e1, e2) -> e1.getAge() - e2.getAge());
		employees.forEach(System.out::println);

		// How many male and female employees are there in the organization?
		System.out.println("*******  Employes Count Based on Gender");
		Map<String, Long> genderCount = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderCount);

		// Print the name of all departments in the organization
		System.out.println("*******  All Departments in Organization ");
		employees.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);

		// What is the average age of male and female employees
		System.out.println(" *******   Average Age of Male and Female Employees : ");
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAgeOfMaleAndFemaleEmployees);

		// Get the employees who have joined after 2015
		System.out.println("*************   Get the employees who have joined after 2015");
		employees.stream().filter(emp -> emp.getYearOfJoining() > 2015).forEach(System.out::println);

		// Get the names of all employees who have joined after 2015
		System.out.println("*************   Get the names of employees who have joined after 2015");
		employees.stream().filter(emp -> emp.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

		// Count the number of employees in each department
		System.out.println("************    Count the number of employees in each department");
		Map<String, Long> employeCountOfEachDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(employeCountOfEachDept);

		// What is the average salary of each department
		System.out.println("****************   What is the average salary of each department");
		Map<String, Double> avgSalOfDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalOfDept);

		// Get the details of youngest male employee in the product development
		// department
		System.out.println("****************   Get the details of youngest male employee in the product development department");
		Optional<Employee> youngestMaleEmployeeinProductionDept = employees.stream()
				.filter(emp -> emp.getGender() == "Male" && emp.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Employee::getAge));
		if (youngestMaleEmployeeinProductionDept.isPresent() && !youngestMaleEmployeeinProductionDept.isEmpty()) {
			System.out.println(youngestMaleEmployeeinProductionDept.get());
		}

		// Who has the most working experience in the Organization?
		System.out.println("****************  Who has the most working experience in the Organization?");
		Optional<Employee> mostExpEmployee = employees.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println(mostExpEmployee.get());

		// How many male and female employees are there in the sales and marketing team
		System.out.println("***************  How many male and female employees are there in the sales and marketing team");
		Map<String, Long> countOfMaleFemaleInSalesDept = employees.stream().filter(emp -> emp.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countOfMaleFemaleInSalesDept);

		// What is the average salary of male and female employees
		System.out.println("*******************  What is the average salary of male and female employees");
		Map<String, Double> avgSalariesOfGenderBase = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalariesOfGenderBase);

		//Employee::getSalar
		
	
		testLearning();

	}

	public static void testLearning() {

		List<Employee> employees = createEmployeeList();

		System.out.println("*******************************&&&&&&&&&&&***********************************");
		// Highest Salary
		System.out.println("Highest Salary : " + employees.stream().mapToDouble(Employee::getSalary).max());

		// 2nd Highest Salary
		System.out.println("2nd Highest Salary : " + employees.stream().mapToDouble(Employee::getSalary).skip(1).max());

		// sort all the employee on the basis of age
		System.out.println("sort all the employee on the basis of age");
		employees.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).forEach(System.out::println);

		// How many male and female employees are there in the organization?
		System.out.println("*******  Employes Count Based on Gender");
		employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
				.forEach((gender, count) -> System.out.println(gender + " : " + count));

		// Print the name of all departments in the organization
		System.out.println("*******  All Departments in Organization ");
		employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		// What is the average age of male and female employees
		System.out.println(" *******   Average Age of Male and Female Employees : ");
		employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
				.forEach((Gender, avgAge) -> System.out.println(Gender + " : " + avgAge));

		// Get the employees who have joined after 2015
		System.out.println("*************   Get the employees who have joined after 2015");
		employees.stream().filter(e -> e.getYearOfJoining() > 2015).collect(Collectors.toList()).forEach(System.out::println);

		// Get the names of all employees who have joined after 2015
		System.out.println("*************   Get the names of employees who have joined after 2015");
		employees.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

		// Count the number of employees in each department
		System.out.println("************    Count the number of employees in each department");
		employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
				.forEach((dept, count) -> System.out.println(dept + " : " + count));

		// What is the average salary of each department
		System.out.println("****************   What is the average salary of each department");

		// Get the details of youngest male employee in the product development
		// department
		System.out.println("****************   Get the details of youngest male employee in the product development department");
		Employee emp = employees.stream()
				.filter(e -> e.getDepartment().equalsIgnoreCase("Product Development") && e.getGender().equalsIgnoreCase("Male"))
				.min(Comparator.comparing(Employee::getAge)).get();
		System.out.println(emp);

		// Who has the most working experience in the Organization?
		System.out.println("****************  Who has the most working experience in the Organization?");
		System.out.println(employees.stream().max(Comparator.comparing(Employee::getYearOfJoining)).get().getName());

		// How many male and female employees are there in the sales and marketing team
		System.out.println("*************** How many male and female employees are there in the sales and marketing team");
		employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
				.forEach((gender, count) -> System.out.println(gender + " : " + count));

		// What is the average salary of male and female employees
		System.out.println("*******************  What is the average salary of male and female employees");
		employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.forEach((gender, sal) -> System.out.println(gender + " : " + sal));

	}

}
