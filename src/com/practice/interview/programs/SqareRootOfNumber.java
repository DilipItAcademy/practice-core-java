package com.practice.interview.programs;

public class SqareRootOfNumber {

	public static void main(String[] args) {
		
		double number = 18;

		System.out.println("Number : " + number);

		double t;
		double squareroot = number / 2;

		do {
			t = squareroot;
			squareroot = (t + (number / t)) / 2;
		} while ((t - squareroot) != 0);

		System.out.println("Square Root : " + squareroot);
	}

}
