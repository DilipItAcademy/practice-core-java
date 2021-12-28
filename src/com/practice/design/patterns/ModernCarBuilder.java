package com.practice.design.patterns;

public class ModernCarBuilder implements CarBuilder {
	
	private String chassis;
	private String body;
	private String paint;
	private String interior;

	public ModernCarBuilder() {
		super();
	}

	@Override
	public CarBuilder fixChassis() {
		System.out.println("Assembling chassis of the modern model");
		this.chassis = "Modern Chassis";
		return this;
	}

	@Override
	public CarBuilder fixBody() {
		System.out.println("Assembling body of the modern model");
		this.body = "Modern Body";
		return this;
	}

	@Override
	public CarBuilder paint() {
		System.out.println("Painting body of the modern model");
		this.paint = "Modern Black Paint";
		return this;
	}

	@Override
	public CarBuilder fixInterior() {
		System.out.println("Setting up interior of the modern model");
		this.interior = "Modern interior";
		return this;
	}

	@Override
	public Car build() {
		Car car = new Car(chassis, body, paint, interior);
		if (car.doQualityCheck()) {
			return car;
		} else {
			System.out.println("Car assembly is incomplete. Can't deliver!");
		}
		return null;
	}
}