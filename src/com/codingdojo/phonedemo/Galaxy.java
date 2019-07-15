package com.codingdojo.phonedemo;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public void ring() {
    	System.out.println(this.getClass().getSimpleName() + " " + this.getVersionNumber() +" says " + this.getRingTone());
    }
    @Override
    public void unlock() {
    	System.out.println("Unlocking via finger print");
    }
    @Override
    public void displayInfo() {
    	System.out.println(this.getClass().getSimpleName() + " " + this.getVersionNumber() +" from " + this.getCarrier());  
    }
	
}
