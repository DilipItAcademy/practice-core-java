package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplier {

	public static void main(String[] args) {

		// consumer is a method that consumes some value and does some operations on
		// them.
		// Consumer For calculating lenght of Each String
		Consumer<String> stringConsumer = s -> System.out.println(s.length());

		Arrays.asList("ab", "abc", "a", "abcd").stream().forEach(stringConsumer);

		// Consumer to display a number
		Consumer<Integer> display = a -> System.out.println(a);

		// Implement display using accept()
		display.accept(10);

		// Consumer to multiply 2 to every integer of a list
		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i < list.size(); i++)
				list.set(i, 2 * list.get(i));
		};

		// Consumer to display a list of numbers
		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);

		// Implement modify using accept()
		modify.accept(list);

		// Implement dispList using accept()
		dispList.accept(list);

		// Supplier : It represents a function which does not take in any argument but
		// produces a value of type T.

		// This function returns a random value.
		Supplier<Double> randomValue = () -> Math.random();

		// Print the random value using get()
		System.out.println(randomValue.get());

		Supplier<String> password = () -> new String("Dilip");
		// Print the password value using get()
		System.out.println(password.get());

	}

}
