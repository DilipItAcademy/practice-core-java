package com.practice.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbersFromList {

    public static void main(String[] args) {

	List<Integer> values = Arrays.asList(1,2,5,6,8,99,20,55,77,44);
	
	values.stream().filter( val -> val % 2==0 ).forEach(System.out::println);	
    }

}
