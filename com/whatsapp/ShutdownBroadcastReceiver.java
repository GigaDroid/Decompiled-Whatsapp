package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Environment;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class ShutdownBroadcastReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "E^WWIMT\u001dLHPU]Q\bESGLIJ\u001erfrm\u007f}zulegais~";
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
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = 48;
                        break;
                    case at.i /*2*/:
                        i3 = 51;
                        break;
                    case at.o /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 38;
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
                    str = "E@C\nULEGAIS^\u001c@^PUAKGHo^@BMQ\u001cVREDV\n";
                    obj = null;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z[1] + Environment.getExternalStorageState());
        App.a(context, 0);
        App.d(context, false);
    }

    ShutdownBroadcastReceiver() {
    }

    public void a(Context context) {
        context.registerReceiver(this, new IntentFilter(z[0]));
    }
}
