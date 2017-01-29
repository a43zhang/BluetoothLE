package com.leoybkim.bluetoothle;

import android.bluetooth.BluetoothDevice;

import java.util.List;
import java.util.UUID;

/**
 * Created by leo on 27/01/17.
 */

public class Device {
    private String deviceAddress;
    private String deviceName;
    private BluetoothDevice device;
    private List<UUID> uuids;

    public Device(BluetoothDevice device, String address, String name, List<UUID> uuids) {
        this.device = device;
        this.deviceAddress = address;
        this.deviceName = name;
        this.uuids = uuids;
    }

    public String getDeviceAddress() { return deviceAddress; }
    public String getDeviceName() { return deviceName; }
    public BluetoothDevice getDevice()  { return device; }
    public List<UUID> getUUIDs() { return  uuids; }
}
