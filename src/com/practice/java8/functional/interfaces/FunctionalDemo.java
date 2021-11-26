package com.practice.java8.functional.interfaces;

public class FunctionalDemo implements FuntionalInterfaceTest {

	public static void main(String[] args) {

		FunctionalDemo demo = new FunctionalDemo();

		//Override methods will be called
		demo.defaultMethod();
		demo.defaultMethodTwo();
		demo.getData();

		//Interface Default Method Will Be Called
		demo.defaultMethodThree();
	}

	@Override
	public String getData() {
		return "Dilip";
	}


	@Override
	public void defaultMethod() {
		System.out.println("Class Default Method From Class");
	}

	@Override
	public void defaultMethodTwo() {
		System.out.println("Class Default Method Two From Class");
	}



}
