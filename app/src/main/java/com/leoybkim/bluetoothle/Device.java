package com.leoybkim.bluetoothle;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import java.util.UUID;

/**
 * Created by leo on 27/01/17.
 */

public class Device implements Parcelable {
    private String deviceAddress;
    private String deviceName;
    private BluetoothDevice device;
    private List<UUID> uuids;

    public Device(BluetoothDevice device, String address, String name) {
        this.device = device;
        this.deviceAddress = address;
        this.deviceName = name;
        this.uuids = uuids;
    }

    public String getDeviceAddress() { return deviceAddress; }
    public String getDeviceName() { return deviceName; }
    public BluetoothDevice getDevice()  { return device; }
    //public List<UUID> getUUIDs() { return  uuids; }


    // Implements Parcelable
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deviceAddress);
        parcel.writeString(this.deviceName);
        parcel.writeParcelable(this.device, i);
        //parcel.writeParcelable(this.uuids, i);
    }

    public static final Parcelable.Creator<Device> CREATOR
            = new Parcelable.Creator<Device>() {
        public Device createFromParcel(Parcel in) {
            return new Device(in);
        }

        public Device[] newArray(int size) {
            return new Device[size];
        }
    };

    private Device(Parcel in) {
        this.deviceAddress = in.readString();
        this.deviceName = in.readString();
        this.device = in.readParcelable(BluetoothDevice.class.getClassLoader());
    }
}
