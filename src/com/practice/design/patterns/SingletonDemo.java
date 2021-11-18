package com.practice.design.patterns;

public class SingletonDemo {

    public static void main(String[] args) {

	Singleton singleInstace = Singleton.getInstance();
	Singleton singleInstace1 = Singleton.getInstance();
	Singleton singleInstace2 = Singleton.getInstance();

	// Returns Same References
	System.out.println(singleInstace);
	System.out.println(singleInstace1);
	System.out.println(singleInstace2);

    }

}
