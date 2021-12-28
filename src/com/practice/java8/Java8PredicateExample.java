package com.practice.java8;

import java.util.function.Predicate;

public class Java8PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> predicate = i -> i > 100;
		boolean greaterCheck = predicate.test(200);
		System.out.println("is 200 greater than 100: " + greaterCheck);
		
		System.out.println("is 50 greater than 100: " + predicate.test(50));

	}

}
