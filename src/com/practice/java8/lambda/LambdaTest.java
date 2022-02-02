package com.practice.java8.lambda;

public class LambdaTest {

	public static void main(String[] args) {

		new Thread(() -> System.out.println("In Run Method ")).start();

		new Thread(

				() -> {
					System.out.println("In Run Method");
					System.out.println("Called start method");
				}).start();

	}

}
