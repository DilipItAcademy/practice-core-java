package com.practice.java8.functional.interfaces;

public class FunctionalInterfaceDemo implements FunctionalInterfaceTwo {

	public static void main(String[] args) {

		FunctionalInterfaceTwo demo = new FunctionalInterfaceDemo();

		demo.testOne();
		demo.tesTwo();

		System.out.println(FunctionalInterfaceOne.getInterfaceData());
		System.out.println(FunctionalInterfaceTwo.getInterfaceData());

		demo.defaultMethod();
		demo.defaultMethodTwo();
		demo.defaultMethodThree();

	}

	@Override
	public void testOne() {
		System.out.println("FunctionalInterfaceOne :: testOne()");

	}

	@Override
	public void tesTwo() {
		System.out.println("FunctionalInterfaceTwo :: tesTwo()");
	}

}
