package io.github.natandsantos.smarthome.devices;


public class SmartDevice{
	private String name;
	private boolean isOn;
	private int energyRating;

	public SmartDevice(String name, int energyRating){
		setName(name);
		setEnergyRating(energyRating);
		setIsOn(false);
	}
	
	public void turnOn(){
		setIsOn(true);
	}
  
	public void turnOff(){
		setIsOn(false);
	}
	
	public void displayStatus(){
		System.out.print(getName() + " is currently ");
		if(isOn){
			System.out.println("ON (Uses: " + getEnergyRating() + "W)\n");
		}
		else {
			System.out.println("OFF\n");
		}
	}
	
	public String getName(){
		if(name != "") {
			return name;
		}
		else {
			String message = "This is an non functional empty device.";
			System.out.println(message);
			return message;
		}
	}
	
	public void setName(String deviceName){
		if(deviceName != "" && deviceName.length() > 5){
			name = deviceName;
		}
		else {
			System.out.println(getName() + "Please, give it a valid name to use it properly.");
		}
		
	}
	
	public boolean getIsOn(){
		return isOn;
	}
	
	private void setIsOn(boolean turnOn){
		if(getName() != "") {
			isOn = turnOn;
		}
		else {
			System.out.println("You cannot change its state");
		}
	}
	
	public int getEnergyRating(){
		return energyRating;
	}
	
	public void setEnergyRating(int energyRating){
		if(getName() != ""){
			this.energyRating = energyRating;
		}
		else{
			System.out.println("You cannot change its rating.");
		}
	}
}