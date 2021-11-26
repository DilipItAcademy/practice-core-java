package com.practice.java8.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		String[] names = new String[10];

		names[3] = "Dilip";
		names[4] = "Singh";

		Optional<String> name = Optional.empty();

		if (name.isEmpty())
			System.out.println("Values is Empty");

		if (name.isPresent())
			System.out.println(name);

		// Passing Null Value : Returns empty
		name = Optional.ofNullable(names[2]);
		System.out.println(name);

		if (name.isEmpty())
			System.out.println("Values is Empty");

		name = Optional.ofNullable(names[3]);
		System.out.println(name);

		if (!name.isEmpty() && name.isPresent())
			// Returns Value
			System.out.println(name.get());

		name = Optional.ofNullable(names[4]);

		//filter and orElse methods

		Optional<String> result = name.filter(n -> n.equalsIgnoreCase("Singhh"));
		if (!result.isEmpty() && result.isPresent())
			System.out.println(result.get());

		System.out.println(result.orElse("Singh"));

	}

}
