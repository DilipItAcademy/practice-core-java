package com.practice.java8.functional.interfaces;

@FunctionalInterface
public interface FunctionalInterfaceOne {

	public void testOne();

	default void defaultMethod() {
		System.out.println("FunctionalInterfaceOne defaultMethod()");
	}

	default void defaultMethodTwo() {
		System.out.println("FunctionalInterfaceOne defaultMethodTwo()");
	}

	default void defaultMethodThree() {
		System.out.println("FunctionalInterfaceOne defaultMethodThree()");
	}

	static String getInterfaceData() {
		return "FunctionalInterfaceOne";
	}

}
