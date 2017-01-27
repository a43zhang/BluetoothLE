package com.leoybkim.bluetoothle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by leo on 27/01/17.
 */

public class DeviceAdapter extends ArrayAdapter<Device> {

    public DeviceAdapter(Context context, List<Device> devices) {
         super(context, 0, devices);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.device_list_item, parent, false);
        }

        Device currentDevice = getItem(position);
        TextView deviceID = (TextView) listItemView.findViewById(R.id.deviceID);
        deviceID.setText(currentDevice.getDeviceID());

        return listItemView;
    }
}
