package com.codewnw.jm3190309.spring.scope.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Car {
	
	public Car() {
		System.out.println("Car is being menufactured.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car...");
	}
}
