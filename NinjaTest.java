package com.characters.objectmaster;

public class NinjaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ninja test = new Ninja();
		Ninja test2 = new Ninja();
		
		test.stealHealth(test2);
		
		System.out.println(test.getHealth());
		System.out.println(test2.getHealth());
		
		test.runAway();
		System.out.println(test.getHealth());
	}

}
