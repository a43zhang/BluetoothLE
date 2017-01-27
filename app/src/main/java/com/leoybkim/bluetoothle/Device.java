package com.leoybkim.bluetoothle;

/**
 * Created by leo on 27/01/17.
 */

public class Device {
    private String deviceAddress;
    private String deviceName;

    public Device(String address, String name) {
        this.deviceAddress = address;
        this.deviceName = name;
    }

    public String getDeviceAddress() { return deviceAddress; }
    public String getDeviceName() { return deviceName; }
}
