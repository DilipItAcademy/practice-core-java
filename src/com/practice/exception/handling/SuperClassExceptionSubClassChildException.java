package com.practice.exception.handling;

//If SuperClass declares an exception and SubClass declares exceptions 
//other than the child exception of the SuperClass declared Exception.

class ParentOne {
	// SuperClass declare an exception
	public void methodOne() throws RuntimeException {
		System.out.println("ParentOne : methodOne");
	}

}

class ChildOne extends ParentOne {
	// SubClass declaring an exception not a child exception of RuntimeException

	public void methodOne() throws ArrayIndexOutOfBoundsException {
		System.out.println("ChildOne : methodOne");
	}

}

public class SuperClassExceptionSubClassChildException {

	public static void main(String[] args) {
		ParentOne p = new ChildOne();
		p.methodOne();
	}

}
