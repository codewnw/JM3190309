package com.codewnw.jm3190309.spring.di.di07;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private MusicSystem musicSystem;

	public Car(List<MusicSystem> musicSystems, @Value("${car.ms}") String musicSystemName) {
		this.musicSystem = musicSystems.stream()
				.filter(ms -> ms.getClass().getSimpleName().equalsIgnoreCase(musicSystemName)).findFirst().get();
		System.out.println("Car is being menufactured.");
	}

	public void driveTheCar() {
		System.out.print("Driving the car and ");
		musicSystem.playMusic();
	}

}
