package com.practice.java8.method.references;

import java.util.Random;

class Person {

    private String name;
    private Integer age;

    public Person() {
	Random ran = new Random();

	// Assigning a random value to name
	this.name = ran.ints(97, 122 + 1).limit(7)
		.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

    public Person(String name, int age) {
	this.name = name;
	this.age = age;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

}