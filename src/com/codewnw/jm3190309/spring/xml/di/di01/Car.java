package com.codewnw.jm3190309.spring.xml.di.di01;

public class Car {

	Engine myEngine;

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
