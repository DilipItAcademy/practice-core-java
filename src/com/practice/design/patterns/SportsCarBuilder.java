package com.practice.design.patterns;

public class SportsCarBuilder implements CarBuilder {
	private String chassis;
	private String body;
	private String paint;
	private String interior;

	public SportsCarBuilder() {
		super();
	}

	@Override
	public CarBuilder fixChassis() {
		System.out.println("Assembling chassis of the sports model");
		this.chassis = "Sporty Chassis";
		return this;
	}

	@Override
	public CarBuilder fixBody() {
		System.out.println("Assembling body of the sports model");
		this.body = "Sporty Body";
		return this;
	}

	@Override
	public CarBuilder paint() {
		System.out.println("Painting body of the sports model");
		this.paint = "Sporty Torch Red Paint";
		return this;
	}

	@Override
	public CarBuilder fixInterior() {
		System.out.println("Setting up interior of the sports model");
		this.interior = "Sporty interior";
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