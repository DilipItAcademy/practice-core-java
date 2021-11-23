package com.practice.java8.streams;

public class Employee {

	private String name;
    private int age;
    private String city;
    private long salary;
    private String designation;

    public Employee(String name, int age, String city, long salary, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.designation = designation;
	}

	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setAge(int age) {
        this.age = age;
    }
        @Override
	public String toString()
    {
        return "Employee Name: "+this.name+" \tAge: "+this.age+ ", \tSalary : "+this.salary+" , \tCity : "+this.city+", \tDesignation : "+this.designation;
    }

}
