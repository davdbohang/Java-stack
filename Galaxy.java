package com.dhang.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    	String message = this.getRingTone();
    	return message;
    }
    @Override
    public String unlock() {
        // your code here
    	String message = "Phone is unlocked";
    	return message; 
    }
    @Override
    public void displayInfo() {
        // your code here
    	String message = "Galaxy S9";
    	System.out.println(message);
    }
}

