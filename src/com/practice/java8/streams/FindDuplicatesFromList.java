package com.practice.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesFromList {

    public static void main(String[] args) {

	List<Integer> values = Arrays.asList(1,2,55,16,177,8,99,16,120,55,177,44);

	Set<Integer> noDups = new HashSet<>();

	//values.stream().filter( val -> !noDups.add(val)).forEach(System.out::println);

	System.out.println("Assigning Result to Same List");

	values = values.stream().filter( val -> !noDups.add(val)).collect(Collectors.toList());

	values.forEach(System.out::println);


	//Find Values Starting With "A"
	List<String> listOfString = Arrays.asList("Singh","Arnav","Dilip","Abhi");
	List<String> listOfStringStartsWithJ = listOfString.stream().filter( s -> s.startsWith("A")).collect(Collectors.toList());
	listOfStringStartsWithJ.forEach(System.out::println);




    }

}
