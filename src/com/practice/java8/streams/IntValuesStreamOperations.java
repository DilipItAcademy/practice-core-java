package com.practice.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntValuesStreamOperations {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("First Five Values Sum");
		System.out.println(values.stream().mapToInt(val -> val).limit(5).sum());

		System.out.println("Last Five Values Sum");
		System.out.println(values.stream().mapToInt(val -> val).skip(values.size() - 5).sum());

		System.out.println("Max Value Of List");
		System.out.println(values.stream().max(Comparator.comparing(Integer::valueOf)).get());

		System.out.println("Min Value Of List");
		System.out.println(values.stream().min(Comparator.comparing(Integer::valueOf)).get());

		// Get Min or Max String/Char
		String maxChar = Stream.of("H", "T", "D", "I", "J").max(Comparator.comparing(String::valueOf)).get();

		String minChar = Stream.of("H", "T", "D", "I", "J").min(Comparator.comparing(String::valueOf)).get();

		System.out.println("maxChar = " + maxChar);
		System.out.println("minChar = " + minChar);

		// Find max or min object by object property
		List<Person> employees = new ArrayList<Person>();

		employees.add(new Person(1, "Lokesh", 36));
		employees.add(new Person(2, "Alex", 46));
		employees.add(new Person(3, "Brian", 52));


		// Get Min and  Max age Employee Object
		Person minObject = employees.stream().min(Comparator.comparing(Person::getAge)).get();
		Person maxObject = employees.stream().max(Comparator.comparing(Person::getAge)).get();

		System.out.println("minObject = " + minObject);
		System.out.println("maxObject = " + maxObject);
		
		//String Data
		 List<String> list = Arrays.asList("a","b","c","a","b");
		 System.out.println(list.stream().filter( s -> s.equals("b")).findFirst());

	}

}

