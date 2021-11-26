package com.practice.java8.method.references;

import java.util.Arrays;

public class InstanceMethodReferenceOfArbitraryObject {

    public static void main(String[] args) {

	String[] names = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };

	//The equivalent lambda expression for the method reference String::compareToIgnoreCase would have the formal parameter list
	//(String a, String b), where a and b are arbitrary names used to better describe this example.
	//The method reference would invoke the method a.compareToIgnoreCase(b).
	Arrays.sort(names, String::compareToIgnoreCase);

	System.out.println("After Sorting...");

	for(String name : names) {
	    System.out.println(name);
	}

    }

}
