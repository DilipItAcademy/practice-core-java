package com.practice.java8.lambda;

@FunctionalInterface
interface CalcAdd {

	public void add(int v1, int v2);

}

@FunctionalInterface
interface CalcSub {

	public int sub(int v1, int v2);

}

public class LambdaWithReturnAndWithoutReturn {

	public static void main(String[] args) {

		CalcAdd calc = (v1, v2) -> System.out.println(v1 + v2);
		calc.add(10, 20);

		CalcSub calc2 = (v1, v2) -> v1 - v2;
		System.out.println(calc2.sub(20, 10));

		// expanding same with return keyword and code block
		CalcSub calc3 = (a, b) -> {
			int result = a - b;
			return result;
		};

		System.out.println(calc3.sub(100, 200));
		
		
		System.out.println(calc3.sub(10,20) + calc2.sub(10, 20));

	}

}
