package com.superfan.otgDemo.otg;

import android.content.Context;

public class OTGUtil {
    private OTGUtil() {
    }

    public static OTGUtil getInstance() {
        return OTGUtil.Instance.INSTANCE;
    }

    private static class Instance {
        private static final OTGUtil INSTANCE = new OTGUtil();
    }

    public void init(Context context){
        //注册广播监听USB的断开与连接
        USBConnectBroadcastReceiver receiver = new USBConnectBroadcastReceiver();
        OTGDeviceManager.getInstance().registerBroadcast(context,receiver);

    }
}
