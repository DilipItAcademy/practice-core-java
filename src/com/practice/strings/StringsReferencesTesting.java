package com.practice.strings;

public class StringsReferencesTesting {

	public static void main(String[] args) {

		String str1 = "Dilip";
		String str2 = new String("Dilip");


		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true

		str2 = str2.intern();


		System.out.println(str1 == str2); // true
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());


		System.out.println(10+20+"Java");
		System.out.println("Java"+10+20);
		System.out.println(10*20+"Java");
		System.out.println("Java"+10*20);


	}

}
