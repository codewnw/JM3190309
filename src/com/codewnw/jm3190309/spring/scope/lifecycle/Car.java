package com.codewnw.jm3190309.spring.scope.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public Car() {
		System.out.println("Car is being menufactured.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car...");
	}
	
	@PostConstruct
	public void afterCarIsReady() {
		System.out.println("Notify the client via mail.");
	}
	
	@PreDestroy
	public void beforeDestructionOfCar() {
		System.out.println("Take engine and music system out of the car");
	}
}
