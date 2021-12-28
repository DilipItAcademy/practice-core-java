package com.practice.java8.functional.interfaces;

interface InterfaceOne{

	default void defaultMethod() {
		System.out.println("InterfaceOne defaultMethod()");
	}

}

interface InterfaceTwo{

	default void defaultMethod() {
		System.out.println("InterfaceTwo defaultMethod()");
	}

}
public class SameDefaultMethodInTwoInterfaces implements InterfaceOne,InterfaceTwo{

	public static void main(String[] args) {

	}

	@Override
	public void defaultMethod() {
		InterfaceTwo.super.defaultMethod();
	}

}
