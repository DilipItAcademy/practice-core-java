package com.practice.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();

		names.add("Dilip");
		names.add("Arnav");
		names.add("Arnav");
		names.add("Abhi");

		names.forEach(System.out::println);

		// Sorting Values
		System.out.println("Sorting Values ");

		Set<String> sortedNames = new TreeSet<>(names);
		sortedNames.forEach(System.out::println);

	}

}
