package com.practice.java8.functional.interfaces.demos;


@FunctionalInterface
public interface FuntionalInterfaceTest {

	    default void defaultMethod(){
	        System.out.println("Interface defaultMethod method");
	    }

	    default void defaultMethodTwo(){
	        System.out.println("Interface defaultMethodTwo method");
	    }

	    public String getData();
	  //  public String getConnection();

}
