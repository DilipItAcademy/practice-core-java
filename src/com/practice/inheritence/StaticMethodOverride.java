package com.practice.inheritence;

class Parent {
	
	public static void staticMethod() {
		System.out.println("Parent Class staticMethod");
	}
	
	public void nonStaticMethod() {
		System.out.println("Parent Class nonStaticMethod");
	}

}

class Child extends Parent {

	public static void staticMethod() {
		System.out.println("Child Class staticMethod");
	}
	
	public void nonStaticMethod() {
		System.out.println("Child Class nonStaticMethod");
	}

}

class AnotherChild extends Parent {

	
	// Override Static method as Non Static : Compile Time error : This instance method cannot override the static method from Parent
	/*
	 * public void staticMethod() {
	 * System.out.println("AnotherChild Class staticMethod"); }
	 */
	
	
	// Override Non Static method as static :  Compile Time error :  This static method cannot hide the instance method from Parent
	/*
	 * public static void nonStaticMethod() {
	 * System.out.println("AnotherChild Class nonStaticMethod"); }
	 */

}

public class StaticMethodOverride {

	public static void main(String[] args) {
		
		Parent p = new Child();
		
		 // As per overriding rules this should call to class Child static overridden method. 
		// Since static method can not be overridden, it calls Parent static method
		p.staticMethod();
		
		 // Here overriding works and Child method  is called
		p.nonStaticMethod();
	}

}
