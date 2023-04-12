package com.superfan.otgDemo.otg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.usb.UsbManager;

public class OTGDeviceManager {
    private OTGDeviceManager() {
    }

    public static OTGDeviceManager getInstance() {
        return Instance.INSTANCE;
    }

    /**
     * 注册广播：主要用于监听OTG设备的连接与断开
     *
     * @param context
     * @param broadcastReceiver
     */
    public void registerBroadcast(Context context, BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        //设备连接
        intentFilter.addAction(UsbManager.ACTION_USB_DEVICE_ATTACHED);
        //设备断开
        intentFilter.addAction(UsbManager.ACTION_USB_DEVICE_DETACHED);
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    private static class Instance {
        private static final OTGDeviceManager INSTANCE = new OTGDeviceManager();
    }
}
