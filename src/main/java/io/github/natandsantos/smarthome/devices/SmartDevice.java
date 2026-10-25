package io.github.natandsantos.smarthome.devices;

public class SmartDevice{
	public static final int LOWER_POWER_LEVEL = 0;
	public static final int HIGHER_POWER_LEVEL = 100;
	private String name;
	private boolean isOn;
	private int energyRating;
	private int powerLevel;
	
	public SmartDevice(String name, int energyRating, double powerLevel){
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
		if(getPowerLevel() != LOWER_POWER_LEVEL && getIsOn() != true){
			setIsOn(true);
		}
	}
  
	public void turnOff(){
		setIsOn(false);
	}
	
	public void displayStatus(){
		System.out.print(getName() + " is currently ");
		if(isOn){
			System.out.println("ON (Uses: " + getEnergyRating() + "W)");
		}
		else {
			System.out.println("OFF");
		}
		System.out.println("Power Level: " + getPowerLevel() + "%\n");
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
		if(deviceName.equals("") && deviceName.trim().length() > 5){
			name = deviceName;
		}
		else {
			System.out.println("Please, give it a valid name to use it properly.");
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
			else if(level < LOWER_POWER_LEVEL){
				powerLevel = 0;
			}
			else if(level > HIGHER_POWER_LEVEL){
				powerLevel = 100;
			}
		}
		else {
			System.out.println("You cannot change its power level.");
		}
	}
	
	public void setPowerLevel(double level) {
		if(getName() != "") {
			if(level >= LOWER_POWER_LEVEL && level <= HIGHER_POWER_LEVEL){
				powerLevel = (int)level;
				System.out.println("Power level set successefully.");
			}
			else if(level < LOWER_POWER_LEVEL){
				powerLevel = 0;
				System.out.println("Power level depleted.");
			}
			else if(level > HIGHER_POWER_LEVEL){
				powerLevel = 100;
				System.out.println("Power Level full.");
			}
		}
		else {
			System.out.println("You cannot change its power level.");
		}
	}
	
	public int getPowerLevel(){
		return powerLevel;
	}
	
	public void executeAction(String command){
		if(isOn == true && getPowerLevel() >= 15){
			setPowerLevel(getPowerLevel()-15);
		}
		else {
			System.out.print(getName() + " cannot execute '" + command);
			System.out.println("' because it is turned OFF or has less than 15% power!");
		}
		if(getPowerLevel() == 0){
			setIsOn(false);
			System.out.println("The device ran out of power during execution. Sutting down...");
		}
	}
	
}