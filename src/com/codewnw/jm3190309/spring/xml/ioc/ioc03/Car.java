package com.codewnw.jm3190309.spring.xml.ioc.ioc03;

public class Car {

	private double speed;

	private Integer modelNumber;

	public Car(String carName, String carColor, double speed, Integer modelNumber) {
		this.speed = speed;
		this.modelNumber = modelNumber;
		System.out.println(carColor + " " + carName + " is being manufactored!!!!");
	}

	public void driveTheCar() {
		System.out.println("Driving the car at speed " + speed + " of model number " + modelNumber);
	}
}
