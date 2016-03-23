package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Process;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class BootReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "&4agv'4cc:!/k";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 68;
                        break;
                    case at.g /*1*/:
                        i3 = 91;
                        break;
                    case at.i /*2*/:
                        i3 = 14;
                        break;
                    case at.o /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "'4`}3'/ge?0\"";
                    obj = null;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z[0]);
        if (App.p != null) {
            App.a(App.z(), 0);
            boolean backgroundDataSetting = ((ConnectivityManager) App.z().getSystemService(z[1])).getBackgroundDataSetting();
            Context z = App.z();
            if (backgroundDataSetting) {
                backgroundDataSetting = false;
            } else {
                backgroundDataSetting = true;
            }
            App.d(z, backgroundDataSetting);
        }
        if (App.t(App.z()) != 3) {
            Process.killProcess(Process.myPid());
        }
    }
}
