package com.practice.interview.programs;

public class TryCatchFinallyWithReturn {

	public static void main(String[] args) throws Exception {

		String result = checkReturn();

		System.out.println("Result : " + result);

	}

	private static String checkReturn() {

		try {
			System.out.println("One");

			throw new Exception();
			
		//	return "Try Block";
			// System.out.println("Two"); // Unreachable code

		} catch (Exception ex) {

			System.out.println("Three");
			return "Catch Block";

		} finally {
			System.out.println("Four");

			return "Finally Block";
		}
	}

}
