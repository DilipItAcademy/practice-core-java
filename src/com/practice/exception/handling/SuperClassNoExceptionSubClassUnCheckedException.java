package com.practice.exception.handling;

//Java Program to Illustrate Exception Handling with Method Overriding 
//Where SuperClass does not declare any exception and
//subclass declare Un-checked exception

class ParentClass {

	// SuperClass doesn't declare any exception
	public void methodOne() {
		System.out.println("ParentClass : methodOne");
	}

}

class ChildClass extends ParentClass {

	// declaring Un-Checked Exception IOException
	public void methodOne() throws ArrayIndexOutOfBoundsException {
		System.out.println("ChildClass : methodOne");
	}

}

public class SuperClassNoExceptionSubClassUnCheckedException {

	public static void main(String[] args) {
		ParentClass s = new ChildClass();
		s.methodOne();
	}

}
