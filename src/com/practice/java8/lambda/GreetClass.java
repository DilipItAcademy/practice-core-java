package com.practice.java8.lambda;

public class GreetClass {

	// Anonymous Class
	GreetInterface greetOne = new GreetInterface() {
		@Override
		public void greetPerson() {
			System.out.println("Anonymous class Greetings");

		}
	};

	// Lambda Expressions with single line
	GreetInterface greetTwo = () -> System.out.println("Lambda Single Line Greetings");

	// Lambda Expressions with multiple lines
	GreetInterface greetThree = () -> {
		System.out.println("Lambda Multi Line Greetings");
		System.out.println("Lambda Multi Line Greetings");
	};

	public static void main(String ar[]) {
		GreetClass greet = new GreetClass();

		greet.greet();
	}

	public void greet() {

		greetOne.greetPerson();

		greetTwo.greetPerson();

		greetThree.greetPerson();

	}
}
