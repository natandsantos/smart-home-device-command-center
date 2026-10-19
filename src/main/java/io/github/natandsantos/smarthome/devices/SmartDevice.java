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
		System.out.print(name + " is currently ");
		if(isOn){
			System.out.println("ON (Uses: " + energyRating + "W)\n");
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
			return "This is an non functional empty device.";
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
		if(name != "") {
			isOn = turnOn;
		}
		else {
			System.out.println("You cannot change empty devices's state");
		}
	}
	
	public int getEnergyRating(){
		return energyRating;
	}
	
	public void setEnergyRating(int energyRating){
		if(name != ""){
			this.energyRating = energyRating;
		}
		else{
			System.out.println("You cannot change empty devices's energy rating.");
		}
	}
}