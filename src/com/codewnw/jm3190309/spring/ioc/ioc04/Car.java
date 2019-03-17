package com.codewnw.jm3190309.spring.ioc.ioc04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCar")
public class Car {
	
	public Car(@Value("${car.name}") String name) {
		System.out.println(name+" car is being menufactured.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car...");
	}
}
