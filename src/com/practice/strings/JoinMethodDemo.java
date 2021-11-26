package com.practice.strings;

import java.util.ArrayList;
import java.util.List;

public class JoinMethodDemo {

	public static void main(String[] args) {

		System.out.println("Join Method Added in Java8. Checking Details ");

		List<String> names = new ArrayList<>();
		names.add("Dilip");
		names.add("Arnav");
		names.add("Singh");
		names.add("Abhi");

		String name = String.join(",", names);
		System.out.println(name);


	}

}
