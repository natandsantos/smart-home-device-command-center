package io.github.natandsantos.smarthome.devices;

public class DeviceManager{
	SmartDevice[] deviceList = new SmartDevice[3];
	
	public void setupDevices(SmartDevice device1, SmartDevice device2, SmartDevice device3) {
		deviceList[0] = device1;
		deviceList[1] = device2;
		deviceList[2] = device3;
		
		System.out.println("Welcome to your Smart Device Command Center!");
		System.out.println("It's all set up to run.");
	}
	
	public SmartDevice[] showAllDevices() {
		int devicesLength = deviceList.length;
		for(int i=0; i < devicesLength; i++) {
			deviceList[i].displayStatus();
		}
		
		return deviceList;
	}
	
	public void blackout() {
		int index = 0;
		while(deviceList.length > index) {
			deviceList[index].turnOff();
			index++;
		}
	}
}