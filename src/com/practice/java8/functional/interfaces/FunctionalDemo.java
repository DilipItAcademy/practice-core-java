package com.practice.java8.functional.interfaces;

public class FunctionalDemo implements FuntionalInterfaceTest {

	public static void main(String[] args) {

		FunctionalDemo demo = new FunctionalDemo();
		demo.defaultMethod();
		demo.defaultMethodTwo();
		demo.getData();

	}

	@Override
	public String getData() {
		return "Dilip";
	}

	@Override
	public void defaultMethod() {
		System.out.println("Class Default Method");
	}

}
