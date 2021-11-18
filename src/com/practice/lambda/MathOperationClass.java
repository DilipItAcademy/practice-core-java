package com.practice.lambda;

public class MathOperationClass {

	public static void main(String[] args) {
		MathOperationClass operations = new MathOperationClass();
		System.out.println(operations.operation("add", 10, 20));
	}

	public int operation(String type, int val1, int val2) {

		MathOperation operatin1 = (operType, value1, value2) -> {
			int result = 0;

			System.out.println("Operation Type : " + operType);
			if (operType.equalsIgnoreCase("add")) {
				result = value1 + value2;
			}
			return result;

		};

		MathOperation operatin2 = (operType, value1, value2) -> (value1 - value2);
		System.out.println(operatin2.operation("subtract", 100, 40));

		return operatin1.operation("add", 10, 20);

	}

}
