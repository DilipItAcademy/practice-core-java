package com.practice.collections;

public class Employee {

    private int emp_id;
    private String name;
    private String address;

    // Constructor
    public Employee(int emp_id, String name, String address) {
	this.emp_id = emp_id;
	this.name = name;
	this.address = address;
    }

    public int getEmp_id() {
	return emp_id;
    }

    public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    // return employee details in the main() method to print it
    public String toString() {
	return this.emp_id + " " + this.name + " " + this.address;
    }
}