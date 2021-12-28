package com.practice.arrays;

public class FindPairsOfElementsSumIs10 {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 4, 5, 7, 8, 9, 10, 2, 5, 6, 3, 5, 10 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				// int temp = arr[i];

				if (arr[j] + arr[i] == 10) {
					System.out.println("Value 1 : " + arr[i] + ", Value 2 : " + arr[j]);
				}

			}

		}
	}

}
