package com.practice.design.patterns;

public interface CarBuilder {

    // Step 1
    public CarBuilder fixChassis();

    // Step 2
    public CarBuilder fixBody();

    // Step 3
    public CarBuilder paint();

    // Step 4
    public CarBuilder fixInterior();

    // delivery of car
	public Car build();
}
