package com.practice.exception.handling;

import java.io.IOException;

//If SuperClass declares an exception and SubClass No Exception declared

class ParentTwo {
	// SuperClass declare an exception
	public void methodOne() throws Exception {
		System.out.println("ParentTwo : methodOne");
	}

}

class ChildTwo extends ParentTwo {
	// SubClass not declaring an exception
	public void methodOne() {
		System.out.println("ChildTwo : methodOne");
	}

}

public class SuperClassExceptionSubClassNoException {

	public static void main(String[] args) throws Exception {
		ParentTwo p = new ChildTwo();
		p.methodOne();
	}

}
