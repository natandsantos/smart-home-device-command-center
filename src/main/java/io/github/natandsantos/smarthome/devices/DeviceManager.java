package io.github.natandsantos.smarthome.devices;

public class DeviceManager{
	public SmartDevice[] deviceList = new SmartDevice[3];
	
	public void setupDevices(SmartDevice device1, SmartDevice device2, SmartDevice device3) {
		deviceList[0] = device1;
		deviceList[1] = device2;
		deviceList[2] = device3;
		
		System.out.println("Welcome to your Smart Device Command Center!");
		System.out.println("It's all set up to run.\n");
	}
	
	public SmartDevice[] showAllDevices() {
		int devicesLength = deviceList.length;
		for(int i=0; i < devicesLength; i++) {
			if(deviceList[i] != null){
				deviceList[i].displayStatus();
			}
			else {
				System.out.println("Null object.");
			}
		}
		
		return deviceList;
	}
	
	public void blackout() {
		int index = 0;
		while(deviceList.length > index){
			if(deviceList[index] != null){
				deviceList[index].turnOff();
				index++;
			}
			else{
				System.out.println("You cannot turn off null obejcts.");
			}
		}
	}
	
	public void boostDevicePower(int boostAmount, SmartDevice device){
		boostAmount *= 2;
		device.setPowerLevel(device.getPowerLevel() + boostAmount);
	}
	
	public void applyPowerSaver(){
		int devicesLength = deviceList.length;
		for(int i = 0; i < devicesLength; i++){
			if(deviceList[i] != null){
				deviceList[i].setPowerLevel(deviceList[i].getPowerLevel()/2);
			}
			else{
				System.out.println("You cannot save power of null objects.");
			}
		}
	}
}