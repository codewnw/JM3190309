package com.codewnw.jm3190309.spring.xml.di.di04;

public class SoniMusicSystem implements MusicSystem {

	public SoniMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being manufactured.");
	}

	public void playTheMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
