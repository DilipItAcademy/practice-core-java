package com.practice.inheritence;

class ParentClass {

	int value = 20;

	public void printValue() {
		System.out.println(value);
	}

}

class ChildClass extends ParentClass {

	int value = 40;

	public void printValue() {
		System.out.println(value);
	}

}

public class TestOverridenData {

	public static void main(String ar[]) {

		ParentClass parent = new ChildClass();
		System.out.println(parent.value);
		parent.printValue();
		
	}

}
