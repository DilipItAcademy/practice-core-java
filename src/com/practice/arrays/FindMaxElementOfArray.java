package com.practice.arrays;

import java.util.Arrays;

public class FindMaxElementOfArray {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 4, 5, 7, 8, 9, 10, 2, 6, 3 };

		int temp;
		int maxValue = 0;

		for (int element : arr) {
			temp = element;
			if (temp > maxValue) {
				maxValue = temp;
			}
		}

		System.out.println("Max Value : " + maxValue);

		// Using Existing Functions
		Arrays.sort(arr);
		System.out.println("Max Value Of An Array : " + arr[arr.length - 1]);

	}

}
