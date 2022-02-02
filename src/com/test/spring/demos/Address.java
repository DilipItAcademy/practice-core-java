package com.test.spring.demos;

public class Address {

	int houseNum;
	String streetName;

	public Address(int houseNum, String streetName) {
		super();
		this.houseNum = houseNum;
		this.streetName = streetName;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}
