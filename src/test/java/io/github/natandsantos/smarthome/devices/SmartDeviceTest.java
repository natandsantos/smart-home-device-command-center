package io.github.natandsantos.smarthome.devices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
    public void turnOnShouldFalse(){
    	int powerLevel = 0;
    	var bathroomLamp = new SmartDevice("Bathroom Lamp", 90, powerLevel);
        bathroomLamp.turnOn();
        assertFalse(bathroomLamp.getIsOn());
    }
    @Test
    public void turnOffShouldFalse() {
    	var kitchenLamp = new SmartDevice("Kitchen Lamp", 80);
    	kitchenLamp.turnOff();
    	assertFalse(kitchenLamp.getIsOn());
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
    
    @Test
    public void executeActionShouldShutDown(){
    	var drinkFountain = new SmartDevice("Drink Fountain", 600, SmartDevice.HIGHER_POWER_LEVEL);
    	drinkFountain.turnOn();
    	System.out.println("Power Level: "+ drinkFountain.getPowerLevel());
    	drinkFountain.executeAction("Drop Water");
    	System.out.println("Power Level: "+ drinkFountain.getPowerLevel());
    	for(int i = 6; i > 0; i--) {
    		drinkFountain.executeAction("Drop Water");
    		System.out.println("Power Level: "+ drinkFountain.getPowerLevel());
    	}
    }
    @Test
    public void nameShouldBeNotNull() {
    	SmartDevice fridge = new SmartDevice("Fridge 2000", 1500, 100);
    	System.out.println(fridge.getName());
    }
    @Test
    public void nameShouldBeNull() {
    	SmartDevice fridge = new SmartDevice("", 1500, 100);
    	System.out.println(fridge.getName());
    }
}
