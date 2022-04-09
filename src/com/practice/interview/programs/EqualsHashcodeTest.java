package com.practice.interview.programs;

public class EqualsHashcodeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empId = 10;
		emp1.empName = "Dilip";

		Employee emp2 = emp1;

		System.out.println(emp2.empId);
		System.out.println(emp2.empName);

		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		Employee emp3 = new Employee();
		emp3 = emp1;
		
		System.out.println(emp1.equals(emp3));
		System.out.println(emp3.hashCode());
		
		Employee emp4 = new Employee();
		emp4.empId = 10;
		emp4.empName = "Dilip";
		
		System.out.println(emp1.equals(emp4));
		
		System.out.println(emp4.hashCode());

	}

}

class Employee {

	public int empId;
	public String empName;

}
