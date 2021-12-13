package com.practice.exception.handling;

//Java Program to Illustrate Exception Handling with Method Overriding 
//Where SuperClass does not declare any exception and
//subclass declare checked exception

class SuperClass {
	// SuperClass doesn't declare any exception
	public void methodOne() {
		System.out.println("SuperClass : methodOne");
	}
}

class SubClass extends SuperClass {

	// declaring Checked Exception IOException
	// public void methodOne() throws IOException{ //Exception in thread "main"
	// java.lang.Error: Unresolved compilation problem:
	public void methodOne() {
		System.out.println("SubClass : methodOne");
	}
}

public class SuperClassNoExceptionSubClassCheckedException {

	public static void main(String[] args) {
		SuperClass s = new SubClass();
		s.methodOne();
	}

}
