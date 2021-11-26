package com.practice.java8.functional.interfaces;

public interface FunctionalInterfaceTwo extends FunctionalInterfaceOne {

	public void tesTwo();

	default void defaultMethod() {
		System.out.println("FunctionalInterfaceTwo defaultMethod()");
	}

	default void defaultMethodTwo() {
		System.out.println("FunctionalInterfaceTwo defaultMethodTwo()");
	}

	default void defaultMethodThree() {
		System.out.println("FunctionalInterfaceTwo defaultMethodThree()");
	}

	static String getInterfaceData() {

		return "FunctionalInterfaceTwo";
	}

}
