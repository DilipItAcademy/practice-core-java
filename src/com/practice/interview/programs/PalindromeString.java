package com.practice.interview.programs;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "r";

		boolean isPalindrome = true;

		// Pointers pointing to the beginning and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				isPalindrome = false;

			// Increment first pointer and decrement the other
			i++; 
			j--;
		}

		if (isPalindrome) {
			System.out.println("It is a palindrome : " + str);
		} else {
			System.out.println("It is Not a palindrome : " + str);
		}

	}

}
