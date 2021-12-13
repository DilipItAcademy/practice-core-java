package com.practice.exception.handling;

//If SuperClass declares an exception and SubClass declares exceptions 
//other than the child exception of the SuperClass declared Exception.

class Parent {
	// SuperClass declare an exception
	public void methodOne() throws RuntimeException{
		System.out.println("Parent : methodOne");
	}

}

class Child extends Parent {
	// SubClass declaring an exception not a child exception of RuntimeException
	
	//public void methodOne()  throws Exception { // Compile Error 
	
	public void methodOne()  throws ArrayIndexOutOfBoundsException {
		System.out.println("Child : methodOne");
	}

}

public class SuperClassExceptionSubClassNoChildException {

	public static void main(String[] args) {
		Parent p = new Child();
		p.methodOne();
	}

}
