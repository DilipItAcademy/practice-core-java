package com.practice.java8.functional.interfaces;

@FunctionalInterface
interface SquareArea {
	int calculate(int x);
}

public class AreaOfSquare {

	public static void main(String ar[]) {

		int a = 5;

		// Lambda expression to define the calculate method
		SquareArea area = (x) -> x * x;

		// Parameter passed and return type must be same as defined in the prototype
		System.out.println(area.calculate(a));

	}

}
