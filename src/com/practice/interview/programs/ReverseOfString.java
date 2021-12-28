package com.practice.interview.programs;

public class ReverseOfString {

	public static void main(String[] args) {

		String name = "Dilip";

		System.out.println("Given String : " + name);
		System.out.println("Reverse OF String : " + new StringBuffer(name).reverse());

		// Using Loop
		String reverseName = "";

		int length = name.length();

		for (int i = length; i >= 1; i--) {
			reverseName = reverseName + name.charAt(i - 1);
		}

		System.out.println("Dilip : " + reverseName);

		// using while Loop
		while (length > 0) {

			System.out.print(name.charAt(length - 1));
			length--;

		}

		// Using Swapping
		char[] temparray = name.toCharArray();
		int left;
		int right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		for (char c : temparray)
			System.out.print(c);

	}

}
