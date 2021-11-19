package com.practice.java8.method.references;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Helper class : Object need to be sorted


public class StaticMethodReferencesDemo {

    // Static method to compare with name
    public static int compareByName(Person a, Person b) {
	return a.getName().compareTo(b.getName());
    }

    // Static method to compare with age
    public static int compareByAge(Person a, Person b) {
	return a.getAge().compareTo(b.getAge());
    }

    public static void main(String[] args) {

	// Creating an empty ArrayList of user-defined type List of person 
	List<Person> personList = new ArrayList<>();

	personList.add(new Person("vicky", 24));
	personList.add(new Person("poonam", 25));
	personList.add(new Person("sachin", 19));

	// Using static method reference to sort list by name
	System.out.println("Sort by name :");
	Collections.sort(personList, StaticMethodReferencesDemo::compareByName);
	personList.stream().map(x -> x.getName()).forEach(System.out::println);

	// Now using static method reference to sort list by age
	System.out.println("Sort by age :");
	Collections.sort(personList, StaticMethodReferencesDemo::compareByAge);
	personList.stream().map(x -> x.getName()).forEach(System.out::println);
	
	
    }
}
