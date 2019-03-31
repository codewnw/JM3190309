package com.codewnw.jm3190309.spring.xml.di.di05;

public class PhilipsMusicSystem implements MusicSystem {

	public PhilipsMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	public void playTheMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
