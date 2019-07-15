package com.codingdojo.phonedemo;

public abstract class Phone {

	// member instance variables
	private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    // Constructor class to set the version, battery, carrier and ringtone
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
    	
    	setVersionNumber(versionNumber);
    	setBatteryPercentage(batteryPercentage);
    	setCarrier(carrier);
    	setRingTone(ringTone);
    }
    
    
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    
    
    
    // ------------------------------Getters and Setters--------------------------------->
	
    
    // ------------Version Getters & Setters-------------->>
 	// Version Getter
 	public String getVersionNumber() {
 		return versionNumber;
 	}
 	
 	// Version Setter
 	public void setVersionNumber(String versionNumber) {
 		this.versionNumber = versionNumber;
 	}
 	
 	
    // ------------Battery Percentages Getters & Setters-------------->>
 	// Battery Percentages Getter
 	public Integer getBatteryPercentage() {
 		return batteryPercentage;
 	}
 	
 	// Battery Percentages Setter
 	public void setBatteryPercentage(int batteryPercentage) {
 		this.batteryPercentage = batteryPercentage;
 	}
    
    
    // ------------Carrier Getters & Setters-------------->>
 	// Carrier Getter
 	public String getCarrier() {
 		return carrier;
 	}
 	
 	// Carrier Setter
 	public void setCarrier(String carrier) {
 		this.carrier = carrier;
 	}
 	
 	
    // ------------Ringtone Getters & Setters-------------->>
 	// Ringtone Getter
 	public String getRingTone() {
 		return ringTone;
 	}
 	
 	// Ringtone Setter
 	public void setRingTone(String ringTone) {
 		this.ringTone = ringTone;
 	}
 	
 	
 	
	
}
