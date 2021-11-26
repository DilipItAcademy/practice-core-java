package com.practice.java8.functional.interfaces;


@FunctionalInterface
public interface FuntionalInterfaceTest {

	    default void defaultMethod(){
	        System.out.println("Interface defaultMethod method");
	    }

	    default void defaultMethodTwo(){
	        System.out.println("Interface defaultMethodTwo method");
	    }

	    default void defaultMethodThree(){
	        System.out.println("Interface defaultMethodThree method");
	    }

	    public String getData();
	  //  public String getConnection();

}
