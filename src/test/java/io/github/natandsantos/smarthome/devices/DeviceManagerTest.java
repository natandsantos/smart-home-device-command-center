package io.github.natandsantos.smarthome.devices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Unit test for simple App.
 */
public class DeviceManagerTest {
	DeviceManager manager = new DeviceManager();
	@Test
	public void setupDeviceTest() {
		SmartDevice stDevice = new SmartDevice("Bathroom Light bulb", 8);
		SmartDevice ndDevice = new SmartDevice("Bedroom Light Switch", 50);
		SmartDevice rdDevice = new SmartDevice("Rice Cooker", 500);
		manager.setupDevices(stDevice, ndDevice, rdDevice);
		assertEquals(manager.deviceList.length, 3);
		assertFalse(manager.deviceList[0].isOn);
	}
	@Test
	public void showAllDevicesTest() {
		SmartDevice stDevice = new SmartDevice("Bathroom Light bulb", 8);
		SmartDevice ndDevice = new SmartDevice("Bedroom Light Switch", 50);
		SmartDevice rdDevice = new SmartDevice("Rice Cooker", 500);
		manager.setupDevices(stDevice, ndDevice, rdDevice);
		manager.deviceList[0].turnOn();
		assertEquals(manager.showAllDevices(), manager.deviceList);
	}
	@Test
	public void shouldTurnAllDevicesOff() {
		SmartDevice stDevice = new SmartDevice("Bathroom Light bulb", 8);
		SmartDevice ndDevice = new SmartDevice("Bedroom Light Switch", 50);
		SmartDevice rdDevice = new SmartDevice("Rice Cooker", 500);
		manager.setupDevices(stDevice, ndDevice, rdDevice);
		manager.blackout();
		manager.showAllDevices();
	}
}
