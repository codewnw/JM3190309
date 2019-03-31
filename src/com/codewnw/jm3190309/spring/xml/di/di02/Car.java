package com.codewnw.jm3190309.spring.xml.di.di02;

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

	public void setMyEngine(Engine myEngine) {
		this.myEngine = myEngine;
	}
}
