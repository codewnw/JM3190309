package com.codewnw.jm3190309.spring.di.di06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	@Qualifier("soniMusicSystem")
	private MusicSystem musicSystem;

	public Car() {
		System.out.println("Car is being menufactured.");
	}

	public void driveTheCar() {
		System.out.print("Driving the car and ");
		musicSystem.playMusic();
	}

}
