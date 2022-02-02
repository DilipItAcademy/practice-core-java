package com.practice.interview.programs;

public class PermutationsOfString {

	// Function to print all the permutations of str
	static void printPermutn(String str, String ans) {

		for (int i = 0; i < str.length(); i++) {

			// i'th character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding the i'th character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call
			printPermutn(ros, ans + ch);

		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		String s = "abb";
		printPermutn(s, "");
	}
}
