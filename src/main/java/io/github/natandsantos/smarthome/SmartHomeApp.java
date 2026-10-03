package io.github.natandsantos.smarthome;
import io.github.natandsantos.smarthome.devices.*;

public class SmartHomeApp{
    public static void main( String[] args ){
    	DeviceManager manager = new DeviceManager();
    	SmartDevice cookTop = new SmartDevice("Cooktop Oster",1500);
    	SmartDevice bedroomLights = new SmartDevice("Bedroom Led Light", 12);
    	SmartDevice livingRoomCurtain = new SmartDevice("Living Room Curtain", 200);
    	manager.setupDevices(cookTop, bedroomLights, livingRoomCurtain);

    }

}
