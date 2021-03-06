package com.codewnw.jm3190309.spring.di.di01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	Engine myEngine;

	@Autowired
	public Car(Engine myEngine) {
		this.myEngine = myEngine;
		System.out.println("Car is being menufactured.");
	}

	public void driveTheCar() {
		boolean isRunning = myEngine.isRunning();
		if (isRunning) {
			System.out.println("Driving the car...");
		} else {
			System.out.println("Not driving the car...");
		}
	}
}
