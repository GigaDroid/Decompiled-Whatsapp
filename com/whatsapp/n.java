package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class n implements ServiceConnection {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "O\u0010te e\u0010Ts3t\u001cdsn`\u001arx%";
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
                        i3 = 2;
                        break;
                    case at.g /*1*/:
                        i3 = 117;
                        break;
                    case at.i /*2*/:
                        i3 = 7;
                        break;
                    case at.o /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 65;
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
                    str = "O\u0010te e\u0010Ts3t\u001cdsnw\u001bey4l\u0011";
                    obj = null;
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.i(z[1]);
        App.h(false);
        App.a(null);
    }

    n() {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i(z[0]);
        App.h(false);
        App.a(((com.whatsapp.messaging.n) iBinder).a());
        App.aF().a(App.ay.jabber_id, App.K, App.p);
    }
}
