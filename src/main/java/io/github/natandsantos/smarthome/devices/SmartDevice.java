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
}