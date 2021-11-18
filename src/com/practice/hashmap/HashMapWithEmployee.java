package com.practice.hashmap;

import java.util.HashMap;

public class HashMapWithEmployee {

	public static void main(String[] args) {

		HashMap<Employe, Integer> employees = new HashMap<>();

	}

}


class Employe{

	private int empId;
	private String empName;

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

}
