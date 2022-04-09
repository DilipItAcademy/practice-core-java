package com.practice.arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeleteValueOfSpecificIndex {

	public static void main(String[] args) {

		int values[] = { 1, 2, 3, 4, 5, 6 };

		// remove 4 index value i.e. 5 Using Streams

		int[] result = IntStream.range(0, values.length).filter(i -> i != 4).map(i -> values[i]).toArray();

		for (int j : result) {
			System.out.println(j);
		}

		int valuesTwo[] = { 1, 2, 3, 4, 5, 6 };

		// remove 4 index value i.e. 5 Using ArrayList
		System.out.println("Using ArrayList ");
		// Create ArrayList from the array
		List<Integer> valuesTwoList = IntStream.of(valuesTwo).boxed().collect(Collectors.toList());

		// Remove the specified element
		valuesTwoList.remove(4);

		// return the resultant array
		result = valuesTwoList.stream().mapToInt(Integer::intValue).toArray();

		for (int j : result) {
			System.out.println(j);
		}

	}

}
