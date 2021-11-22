package com.practice.hashmap;

import java.util.HashMap;

public class HashMapWithEmployee {

    public static void main(String[] args) {

	HashMap<Employe, String> employees = new HashMap<>();

	Employe e1 = new Employe(1, "Dilip");
	Employe e2 = new Employe(2, "Arnav");
	Employe e3 = new Employe(3, "Abhi");
	Employe e4 = new Employe(1, "Dilip");

	employees.put(e1, "Employee 1");
	employees.put(e2, "Employee 2");
	employees.put(e3, "Employee 3");
	employees.put(e4, "Employee 1");

	
	e3.setEmpName("Abhi Singh");
	e4.setEmpName("Dilip Singh");

	employees.forEach((key, value) -> {
	    System.out
		    .println("Emp Id : " + key.getEmpId() + ", Emp Name : " + key.getEmpName() + ", Value : " + value);
	});

    }

}

class Employe {

    private int empId;
    private String empName;

    public Employe(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
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

    // Depends only on account number
    @Override
    public int hashCode() {
	
	final int prime = 31;
	return prime * 1 + this.empId;
    }

    // Compare only account numbers
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	if (this.empId != ((Employe)obj).empId)
	    return false;
	return true;
    }

}
