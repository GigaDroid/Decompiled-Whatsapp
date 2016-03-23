package com.whatsapp.gdrive;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class ds implements ServiceConnection {
    private static final String[] z;
    final SettingsGoogleDrive a;

    static {
        String[] strArr = new String[2];
        String str = "\u000fx%+#\u0012z\"r-\u0018o8)/Sn4-<\u0015~4r.\u0015n20$\u0012x2+/\u0018";
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
                        i3 = 124;
                        break;
                    case at.g /*1*/:
                        i3 = 29;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 95;
                        break;
                    default:
                        i3 = 74;
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
                    str = "\u000fx%+#\u0012z\"r-\u0018o8)/Sn4-<\u0015~4r)\u0013s?:)\bx5";
                    obj = null;
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        SettingsGoogleDrive.a(this.a, null);
        SettingsGoogleDrive.o(this.a).close();
        Log.i(z[0]);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        SettingsGoogleDrive.a(this.a, ((dg) iBinder).a());
        SettingsGoogleDrive.k(this.a).ad().j();
        bq.a(new cx(this));
        SettingsGoogleDrive.o(this.a).open();
        Log.i(z[1]);
    }

    ds(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }
}
