package com.codewnw.jm3190309.spring.xml.di.di03;

public class Car {

	Engine myEngine;

	MusicSystem musicSystem;
	
	public Car(Engine engine) {
		this.myEngine = engine;
		System.out.println("Car got the engine.");
		System.out.println("Car is being menufactured.");
	}

	public void driveTheCar() {
		boolean isRunning = myEngine.isRunning();
		if (isRunning) {
			System.out.println("Driving the car...");
			musicSystem.playTheMusic();
		} else {
			System.out.println("Not driving the car...");
		}
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
		System.out.println("Car got the music system");
	}
}
