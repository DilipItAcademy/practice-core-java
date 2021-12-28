package com.practice.interview.programs;

public class FibnocciSeries {

	public static void main(String[] args) {

		int previous = 0;
		int next = 1;

		while (previous <= 100) {
			System.out.println(previous);
			int current = previous + next;
			previous = next;
			next = current;

		}

	}

}
