package com.practice.java8;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);

	}

}
