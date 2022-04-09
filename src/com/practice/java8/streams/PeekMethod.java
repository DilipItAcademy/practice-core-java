package com.practice.java8.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekMethod {

	public static void main(String ar[]) {

		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
			.peek(e -> System.out.println("Filtered value: " + e))
			.map(String::toUpperCase)
			.peek(e -> System.out.println("Mapped value: " + e))
			.collect(Collectors.toList());

	}

}
