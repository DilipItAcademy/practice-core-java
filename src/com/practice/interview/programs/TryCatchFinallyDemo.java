package com.practice.interview.programs;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {

		try {
			System.out.println("One");
			process();
			System.out.println("Three");
		}catch (Exception e) {
			System.out.println("Two");
		}finally {
			System.out.println("Five");
		}
		
		System.out.println("Six");
	}

	private static void process() throws Exception{
		throw new Exception("Four");
	}

}
