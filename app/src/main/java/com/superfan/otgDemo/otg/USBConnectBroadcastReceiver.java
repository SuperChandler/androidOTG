package com.superfan.otgDemo.otg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.util.Log;

import java.util.HashMap;

public class USBConnectBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "USBConnectBroadcastRece";
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null){
            Log.e(TAG, "onReceive: action=null");
            return;
        }
        switch (action){
            case UsbManager.ACTION_USB_DEVICE_ATTACHED://设备连接
                Log.i(TAG, "onReceive: USB设备连接");
                //获取usb管理类
                UsbManager usbManager = (UsbManager) context.getSystemService(Context.USB_SERVICE);
                //获取到当前手机连接的设备列表（如果为空，则表示一个也没有连接，或者未激活授权）
                HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();

                for (UsbDevice usbDevice : deviceList.values()) {

                }

                break;
            case UsbManager.ACTION_USB_DEVICE_DETACHED://设备断开
                Log.i(TAG, "onReceive: USB设备断开");
                break;
            default:
                break;
        }
    }
}
