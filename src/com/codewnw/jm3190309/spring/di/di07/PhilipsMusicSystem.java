package com.codewnw.jm3190309.spring.di.di07;

import org.springframework.stereotype.Component;

@Component
public class PhilipsMusicSystem implements MusicSystem {

	public PhilipsMusicSystem() {
		System.out.println("Philips music system has been menufactured.");
	}

	@Override
	public void playMusic() {
		System.out.println("Playing music on Philips music system");
	}

}
