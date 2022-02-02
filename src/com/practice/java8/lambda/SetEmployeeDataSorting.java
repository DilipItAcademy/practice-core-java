package com.practice.java8.lambda;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SetEmployeeDataSorting {

	public static void main(String ar[]) {

		Set<Employee> employees = new HashSet<>();

		employees.add(new Employee(100, "Dilip", 40000, "Accounts"));
		employees.add(new Employee(300, "Abhi", 55400, "Teaching"));
		employees.add(new Employee(50, "Arnav", 6000, "Teaching"));
		employees.add(new Employee(200, "Haritha", 3000, "Accounts"));
		employees.add(new Employee(115, "Sai", 300000, "Admin"));

		System.out.println("********************** Before Sorting ******************");
		for (Employee emp : employees) {
			System.out.println("Emp Id : " + emp.getEmpId() + ", Emp Name : " + emp.getEmpName() + ", Emp Salary:" + emp.getSalary() + ", Emp Dept" + emp.getDept());
		}

		// employees.forEach(System.out::println);

		System.out.println("--- Employees after sorted based on emp Id ---");
		employees.stream().sorted(Comparator.comparingInt(Employee::getEmpId)).forEach(emp -> {
			System.out.println("Emp Id : " + emp.getEmpId() + ", Emp Name : " + emp.getEmpName() + ", Emp Salary:" + emp.getSalary() + ", Emp Dept" + emp.getDept());
		});

		System.out.println("--- Employees after sorted based on emp Id in Reverse Order ---");
		employees.stream().sorted(Comparator.comparingInt(Employee::getEmpId).reversed()).forEach(emp -> {
			System.out.println("Emp Id : " + emp.getEmpId() + ", Emp Name : " + emp.getEmpName() + ", Emp Salary:" + emp.getSalary() + ", Emp Dept" + emp.getDept());
		});

	}

}
