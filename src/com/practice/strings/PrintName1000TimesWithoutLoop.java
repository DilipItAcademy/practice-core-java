package com.practice.strings;

public class PrintName1000TimesWithoutLoop {

	public static void main(String[] args) {

		String temp = "i";

		temp = temp.replace("i", "iiiiiiiiii");
		temp = temp.replace("i", "iiiiiiiiii");
		temp = temp.replace("i", "iiiiiiiiii");

		String name = temp.replace("i", "Dilip Singh \n");
		System.out.println(name);

	}

}
