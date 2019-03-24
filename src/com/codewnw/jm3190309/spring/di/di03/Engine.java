package com.codewnw.jm3190309.spring.di.di03;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine is being menufactured.");
	}

	public boolean isRunning() {
		int randomNumber = ((int) (Math.random() * 10));
		System.out.println(randomNumber);
		return randomNumber % 2 == 0;
	}

}
