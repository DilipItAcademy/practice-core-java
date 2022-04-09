package com.practice.java8.streams;

import java.util.Arrays;
import java.util.List;

public class SecondHigestAndLowestNumber {

	public static void main(String[] args) {

		// 2nd Highest : 77
		// 2nd Lowest : 2
		List<Integer> values = Arrays.asList(1, 2, 5, 6, 8, 99, 20, 55, 77, 44);

		System.out.println(values.stream().sorted().skip(1).findFirst().get());
		System.out.println(values.stream().sorted().skip(values.size() - 2).findFirst().get());

	}

}
