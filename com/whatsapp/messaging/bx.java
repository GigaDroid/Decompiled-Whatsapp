package com.whatsapp.messaging;

import android.net.wifi.WifiManager;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class bx implements OnClickListener {
    private static final String[] z;
    final CaptivePortalActivity a;

    static {
        String[] strArr = new String[2];
        String str = ";\u0016\u0018\u001aa3\u001aK\fj9\u0016K\tb;\u0016\u0004";
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
                        i3 = 95;
                        break;
                    case at.g /*1*/:
                        i3 = 127;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 3;
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
                    str = "(\u0016\r\u0012";
                    obj = null;
            }
        }
    }

    public void onClick(View view) {
        Log.i(z[0]);
        ((WifiManager) this.a.getSystemService(z[1])).setWifiEnabled(false);
        this.a.finish();
    }

    bx(CaptivePortalActivity captivePortalActivity) {
        this.a = captivePortalActivity;
    }
}
