package io.github.natandsantos.smarthome.devices;


public class SmartDevice{
	public String name;
	public boolean isOn;
	public int energyRating;

	public SmartDevice(String name, int energyRating){
		this.name = name;
		this.energyRating = energyRating;
		isOn = false;
	}
	
	public void turnOn(){
		isOn = true;
	}
  
	public void turnOff(){
		isOn = false;
	}
	
	public void displayStatus() {
		System.out.println(name + " is currently ");
		if(isOn){
			System.out.println("ON (Uses: " + energyRating + "W");
		}
		else {
			System.out.println("OFF");
		}
	}
}