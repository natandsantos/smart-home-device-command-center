package io.github.natandsantos.smarthome.devices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class SmartDeviceTest {

    @Test
    public void turnOnShouldTrue() {
        var bathroomLamp = new SmartDevice("Bathroom Lamp", 90);
        bathroomLamp.turnOn();
        assertTrue(bathroomLamp.getIsOn());
    }
    @Test
    public void turnOffShouldFalse() {
    	var kitchenLamp = new SmartDevice("Kitchen Lamp", 80);
    	kitchenLamp.turnOff();
    	assertTrue(!kitchenLamp.getIsOn());
    } 
    @Test
    public void displayStatusShouldOn() {
    	var livingRoomTV = new SmartDevice("Living Room TV", 460);
    	livingRoomTV.turnOn();
    	livingRoomTV.displayStatus();
    }
    @Test
    public void displayStatusShouldOff() {
    	var bedroomTV = new SmartDevice("Bed Room TV", 300);
    	bedroomTV.turnOff();
    	bedroomTV.displayStatus();
    }
    @Test
    public void setPowerLevelShouldPass(){
    	var coffeeMaker = new SmartDevice("Coffee Maker", 550, SmartDevice.HIGHER_POWER_LEVEL);
    	System.out.println(coffeeMaker.getPowerLevel());
    	coffeeMaker.displayStatus();
    	
    	
    }
}
