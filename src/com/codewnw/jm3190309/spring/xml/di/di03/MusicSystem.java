package com.codewnw.jm3190309.spring.xml.di.di03;

public class MusicSystem {

	public MusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	public void playTheMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
