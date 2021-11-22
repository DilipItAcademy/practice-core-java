package com.practice.strings;

public class ReverseOfString {

	public static void main(String[] args) {

		String name = "Dilip Singh";

		System.out.println("Before Reverse : " + name);

		StringBuffer reverse = new StringBuffer();

		for (int i = (name.length() - 1); i >= 0; i--) {
			reverse.append(name.charAt(i));
		}

		System.out.println("After Reverse : " + reverse);

		// Using in Built Method;
		System.out.println(new StringBuffer(name).reverse());

		// Using Swapping
		char[] temparray = name.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

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
