package com.practice.java8.method.references;

//To Sort with Custom Comparator But using object method reference

import java.util.*;

//Comparator class
class ComparisonProvider {

    // To compare with name
    public int compareByName(Person a, Person b) {
	return a.getName().compareTo(b.getName());
    }

    // To compare with age
    public int compareByAge(Person a, Person b) {
	return a.getAge().compareTo(b.getAge());
    }
}

public class InstaceMethodReferenceDemo {

    public static void main(String[] args) {

	// Creating an empty ArrayList of user-defined type List of person
	List<Person> personList = new ArrayList<>();

	personList.add(new Person("vicky", 24));
	personList.add(new Person("poonam", 25));
	personList.add(new Person("sachin", 19));

	// A comparator class with multiple comparator methods
	ComparisonProvider comparator = new ComparisonProvider();

	System.out.println("Sort by name :");

	// Now using instance method reference to sort array by name
	Collections.sort(personList, comparator::compareByName);
	personList.stream().map(x -> x.getName()).forEach(System.out::println);

	System.out.println("Sort by age :");

	// Using instance method reference to sort array by age
	Collections.sort(personList, comparator::compareByAge);
	personList.stream().map(x -> x.getName()).forEach(System.out::println);

    }

}
