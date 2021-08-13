package com.characters.objectmaster;

public class Samurai extends Human {
	
	private static int numSamurai = 0;
	
	public Samurai() {
		this.setHealth(200); 
		Samurai.numSamurai++;
	}
	
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth(this.getHealth()/2);
	}
	
	public void meditate() {
		this.setHealth(this.getHealth() * 1.5);
	}

	public int howMany() {
		return Samurai.numSamurai;
	}
}
