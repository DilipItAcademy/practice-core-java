package com.practice.java8.lambda;

public class Employee {

	private int empId;
	private String empName;
	private int salary;
	private String dept;

	public Employee(int empId, String empName, int salary, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
