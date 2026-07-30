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
        assertTrue(bathroomLamp.isOn);
    }
    @Test
    public void turnOffShouldFalse() {
    	var kitchenLamp = new SmartDevice("Kitchen Lamp", 80);
    	kitchenLamp.turnOff();
    	assertTrue(kitchenLamp.isOn);
    } 
    @Test
    public void displayStatusShouldOn() {
    	var livingRoomTV = new SmartDevice("Living Room TV", 460);
    	livingRoomTV.displayStatus();
    }
}
