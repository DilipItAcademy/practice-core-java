package com.practice.java8.lambda;

@FunctionalInterface
public interface MathOperation {

	public int operation(String operation , int val1, int val2);
}
