package com.codewnw.jm3190309.spring.ioc.ioc02;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public Car() {
		System.out.println("Car is being menufactured.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car...");
	}
}
