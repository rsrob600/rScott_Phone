package com.codingdojo.phonedemo;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public void ring() {
        System.out.println(this.getClass().getSimpleName() + " " + this.getVersionNumber() +" says " + this.getRingTone());
    }
    @Override
    public void unlock() {
        System.out.println("Unlocking via facial recognition");
    }
    @Override
    public void displayInfo() {
        System.out.println(this.getClass().getSimpleName() + " " + this.getVersionNumber() +" from " + this.getCarrier());
    }
	
	
}
