package com.practice.collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Dilip");
		names.add("Arnav");
		names.add("Arnav");
		names.add("Abhi");

		names.forEach(System.out::println);

		System.out.println("Values After Removing");

		Set<String> filterNames = new HashSet<>();
		filterNames.addAll(names);

		filterNames.forEach(System.out::println);

		// JAVA8 : Find Duplicates
		System.out.println("Using Java8");
		Set<String> filter = new HashSet<>();
		names = names.stream().filter(val -> !filter.add(val)).collect(Collectors.toList());

		names.forEach(System.out::println);

		// JAVA8: Remove Duplicates

		System.out.println("Removing Duplicates From Below List");

		names.add("Dilip");
		names.add("Arnav");
		names.add("Arnav");
		names.add("Abhi");

		names.forEach(System.out::println);
		Set<String>  filter2 = new HashSet<>();
		names = names.stream().filter( val -> filter2.add(val)).collect(Collectors.toList());

		System.out.println("List After Duplicates removal ");
		names.forEach(System.out::println);

	}

}
