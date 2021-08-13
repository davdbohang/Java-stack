package com.characters.objectmaster;

public class InteractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		
		System.out.println("Wizard health: " + wizard.getHealth());
		System.out.println("Ninja health: " + ninja.getHealth());
		System.out.println("Samurai health: " + samurai.getHealth());
		
		wizard.fireball(samurai);
		wizard.fireball(ninja);

		System.out.println("Wizard health: " + wizard.getHealth());
		System.out.println("Ninja health: " + ninja.getHealth());
		System.out.println("Samurai health: " + samurai.getHealth());
		
		ninja.stealHealth(wizard);
		ninja.stealHealth(samurai);
		
		System.out.println("Wizard health: " + wizard.getHealth());
		System.out.println("Ninja health: " + ninja.getHealth());
		System.out.println("Samurai health: " + samurai.getHealth());
		
		samurai.deathBlow(wizard);
		samurai.deathBlow(ninja);
		
		System.out.println("Wizard health: " + wizard.getHealth());
		System.out.println("Ninja health: " + ninja.getHealth());
		System.out.println("Samurai health: " + samurai.getHealth());
		
	}

}
