package com.codewnw.jm3190309.spring.di.di02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	Engine myEngine;

	public Car() {
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

	public Engine getMyEngine() {
		return myEngine;
	}

	@Autowired
	public void setMyEngine(Engine myEngine) {
		this.myEngine = myEngine;
	}
}
