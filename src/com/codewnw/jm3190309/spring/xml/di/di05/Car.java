package com.codewnw.jm3190309.spring.xml.di.di05;

public class Car {

	Engine engine;

	MusicSystem musicSystem;

	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car got the " + engine.getClass().getSimpleName());
		System.out.println("Car is being menufactured.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car...");
		musicSystem.playTheMusic();
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
		System.out.println("Car got the " + musicSystem.getClass().getSimpleName());
	}
}
