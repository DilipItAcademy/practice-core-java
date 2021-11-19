package com.practice.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedAndNonRepeatedCharsOfString {

    public static void main(String[] args) {

	String str = "Dilip Singh Baludra";

	// Using HashMap
	Map<Character, Integer> countCharacters = new HashMap<>();

	for (int i = 0; i < str.length(); i++) {
	    Character c = str.charAt(i);
	    if (!countCharacters.containsKey(c)) {
		countCharacters.put(c, 1);
	    } else {
		countCharacters.put(c, countCharacters.get(c) + 1);
	    }
	}

	// As LinkedHashMap maintains insertion order
	System.out.println("Non Repeated Characters");
	for (Entry<Character, Integer> e : countCharacters.entrySet()) {
	    if (e.getValue() == 1)
		System.out.println(e.getKey());

	}

	System.out.println("Repeated Characters");
	// Repeated Characters
	for (Entry<Character, Integer> e : countCharacters.entrySet()) {
	    if (e.getValue() > 1)
		System.out.println(e.getKey());

	}

	// Using Only Loop
	int count;

	// Converts given string into character array
	char string[] = str.toCharArray();

	System.out.println("Duplicate characters in a given string: ");
	// Counts each character present in the string
	for (int i = 0; i < string.length; i++) {
	    count = 1;
	    for (int j = i + 1; j < string.length; j++) {
		if (string[i] == string[j] && string[i] != ' ') {
		    count++;
		    // Set string[j] to 0 to avoid printing visited character
		    string[j] = '0';
		}
	    }
	    // A character is considered as duplicate if count is greater than 1
	    if (count > 1 && string[i] != '0')
		System.out.println(string[i]);
	}

    }

}
