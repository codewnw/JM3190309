package com.codewnw.jm3190309.spring.di.di07;

import org.springframework.stereotype.Component;

@Component
public class SoniMusicSystem implements MusicSystem {

	public SoniMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " has been menufactured.");
	}

	@Override
	public void playMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
