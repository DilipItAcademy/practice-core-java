package com.test.spring.demos;

public class Employee {

	int empId;
	String empname;
	Address empAddress;   // Dependecy calss 

	public Employee(int empId, String empname) {
		super();
		this.empId = empId;
		this.empname = empname;
	}
	
	public static void main(String ar[]) {
		
		Employee emp1 = new Employee(1, "Mahesh"); // Object create 
		emp1.empDetails();
	}
	
	public void empDetails() {
		
		System.out.println(empId);
		System.out.println(empname);
		System.out.println(empAddress.getHouseNum());
		System.out.println(empAddress.getStreetName());
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

}
