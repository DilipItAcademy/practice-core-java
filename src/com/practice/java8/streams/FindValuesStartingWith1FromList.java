package com.practice.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FindValuesStartingWith1FromList {

    public static void main(String[] args) {
	
	
	List<Integer> values = Arrays.asList(1,2,5,16,8,99,120,55,177,44);
	
	//Sorting 
	System.out.println("Sorting");
	values.stream().sorted().forEach(System.out::println);
	
	System.out.println("checking actual list instance is modified or not. ");
	//checking actual list instance is modified or not. 
	values.stream().forEach(System.out::println);
	
	//checking values starting with 1 
	System.out.println("checking values starting with 1 ");
	values.stream().map( str -> str+"").filter( str -> str.startsWith("1")).forEach(System.out::println);
	
    }

}
