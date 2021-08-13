package com.characters.objectmaster;

public class WizardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard test = new Wizard();
		Wizard test2 = new Wizard();
		
		System.out.println(test.getHealth());
		test.fireball(test2);
		test.heal(test2);
		System.out.println(test2.getHealth());
	}
}
