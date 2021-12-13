package com.practice.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {

	public static void main(String[] args) {

		List<String> listData = new ArrayList<>();

		listData.add("Dilip");
		listData.add("Arnav");
		listData.add("Abhi");
		listData.add("Haritha");

		//List Maintains Insertion Order : Internally uses Array List
		listData.forEach(System.out::println);

		System.out.println("\nList: Adding value at specific index");
		listData.add(2, "Singh");

		listData.forEach(System.out::println);

		//Checking Set Data : Not Maintains Insertion Order : Internally uses Hashmap
		System.out.println("\nData Inserting into Set");
		Set<String> setData =new HashSet<>();

		setData.add("Dilip");
		setData.add("Arnav");
		setData.add("Abhi");
		setData.add("Haritha");
		setData.add("Dilip");
		setData.add("dilip");

		setData.forEach(System.out::println);


	}

}
