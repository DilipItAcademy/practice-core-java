package com.practice.design.patterns;

public class EmployeeBuilderDemoMain {
    public static void main(String[] args) {

	Employee emp1 = new Employee.EmployeeBuilder()
		.empNo(100)
		.name("Brijesh")
		.projectName("Builder Pattern")
		.build();


	System.out.println(emp1);
    }
}