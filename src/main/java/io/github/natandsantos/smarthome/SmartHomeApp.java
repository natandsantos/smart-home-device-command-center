package io.github.natandsantos.smarthome;
import io.github.natandsantos.smarthome.devices.*;

public class SmartHomeApp{
    public static void main( String[] args ){
    	DeviceManager manager = new DeviceManager();
    	SmartDevice cookTop = new SmartDevice("Cooktop Oster",1500, 100);
    	SmartDevice bedroomLights = new SmartDevice("Bedroom Led Light", 12, -15);
    	SmartDevice livingRoomCurtain = new SmartDevice("Living Room Curtain", 200, 150);
    	manager.setupDevices(cookTop, bedroomLights, livingRoomCurtain);
    	
    	manager.showAllDevices();
    	
    	manager.deviceList[0].turnOn();
    	manager.deviceList[1].turnOn();
    	manager.showAllDevices();
    	
    	manager.blackout();
    	manager.showAllDevices();
    	
    	int boostAmount = 17;
    	System.out.println(boostAmount);
    	manager.boostDevicePower(boostAmount, livingRoomCurtain);
    	System.out.println(boostAmount);
    	
    	manager.deviceList[3].executeAction("Turn volume up");
    	manager.deviceList[3].turnOff();
    	manager.deviceList[3].executeAction("Change channel");
    	manager.deviceList[3].displayStatus();
    	
    	manager.deviceList[0].executeAction("High up temperature");
    }

}
