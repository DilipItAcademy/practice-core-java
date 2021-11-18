package com.practice.interview.programs;

import java.util.HashMap;

public class CountOfCharactersInString {

	public static void main(String[] args) {
		// Using HashMap
		String name = "Tekk teacher Student";

		HashMap<Character, Integer> charCountMap = new HashMap<>();

		for (int i = 0; i < name.length(); i++) {

			if (charCountMap.containsKey(name.charAt(i))) {
				charCountMap.put(name.charAt(i), charCountMap.get(name.charAt(i))+1);
			} else {
				charCountMap.put(name.charAt(i), 1);
			}

		}

		charCountMap.forEach((key,value) -> System.out.println("Cahr : "+key+" Count : "+value));

		//First Repeated and NonRepeated character From String

		//Using Java8


	}

}
