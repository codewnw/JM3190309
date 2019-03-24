package com.codewnw.jm3190309.spring.di.di04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	Engine myEngine;
	
	@Autowired
	MusicSystem musicSystem;

	public Car() {
		System.out.println("Car is being menufactured.");
	}

	public void driveTheCar() {
		boolean isRunning = myEngine.isRunning();
		if (isRunning) {
			System.out.println("Driving the car...");
			musicSystem.playMusic();
		} else {
			System.out.println("Not driving the car...");
		}
	}
}
