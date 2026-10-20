package io.github.natandsantos.smarthome.devices;

public class SmartDevice{
	public static final int LOWER_POWER_LEVEL = 0;
	public static final int HIGHER_POWER_LEVEL = 100;
	private String name;
	private boolean isOn;
	private int energyRating;
	private int powerLevel;

	public SmartDevice(String name, int energyRating, int powerLevel){
		setName(name);
		setEnergyRating(energyRating);
		setIsOn(false);
		setPowerLevel(powerLevel);
	}
	
	public SmartDevice(String name, int energyRating){
		setName(name);
		setEnergyRating(energyRating);
		setIsOn(false);
		setPowerLevel(HIGHER_POWER_LEVEL);
	}
	
	public void turnOn(){
		if(getPowerLevel() != LOWER_POWER_LEVEL || getIsOn() != true){
			setIsOn(true);
		}
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
	
	public void setPowerLevel(int level){
		if(getName() != "") {
			if(level >= LOWER_POWER_LEVEL && level <= HIGHER_POWER_LEVEL){
				powerLevel = level;
			}
			else{
				System.out.println("Invalid power level value.");
			}
		}
		else {
			System.out.println("You cannot change its power level.");
		}
	}
	
	public int getPowerLevel(){
		return powerLevel;
	}
	
}