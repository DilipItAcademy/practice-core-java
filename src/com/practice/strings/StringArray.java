package com.practice.strings;

public class StringArray {

	public static void main(String[] args) {

		String[] arr = { "1,2", "~", "3,4" };
		String output = new String();

		for (String val : arr) {

			if (val != "~")
				output = output+" " + val.replace(",", " ");

		}

		System.out.println(output);
	}

}
