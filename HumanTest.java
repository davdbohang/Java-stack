package com.characters.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human test = new Human();
		Human test2 = new Human();
		
		test.attack(test2);
		test2.attack(test);
		test2.attack(test);
		
		System.out.println(test.getHealth());
		System.out.println(test2.getHealth());
	}

}
