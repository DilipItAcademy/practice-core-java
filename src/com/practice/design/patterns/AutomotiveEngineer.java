package com.practice.design.patterns;

public class AutomotiveEngineer {

	private CarBuilder builder;

	public AutomotiveEngineer(CarBuilder builder) {
		super();
		this.builder = builder;

		System.out.println(this.builder);

		if (this.builder == null) {
			throw new IllegalArgumentException("Automotive Engineer can't work without Car Builder!");
		}
	}

	public Car manufactureCar() {
		return builder.fixChassis().fixBody().paint().fixInterior().build();
	}
}