package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class HeadsetPlugBroadcastReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "hxP\u000e3`r\u001a\u00152}sZ\brhu@\u00153g8|9\u001dMEq(\u0003YZa;";
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
                        i3 = 9;
                        break;
                    case at.g /*1*/:
                        i3 = 22;
                        break;
                    case at.i /*2*/:
                        i3 = 52;
                        break;
                    case at.o /*3*/:
                        i3 = 124;
                        break;
                    default:
                        i3 = 92;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "zbU\b9";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "hfDS4lwP\u000f9}9";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    HeadsetPlugBroadcastReceiver() {
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = false;
        int intExtra = intent.getIntExtra(z[2], 0);
        if (App.t && intExtra < 1) {
            i8.m();
        }
        if (intExtra >= 1) {
            z = true;
        }
        App.t = z;
        Log.i(z[1] + intExtra);
    }

    public void a(Context context) {
        context.registerReceiver(this, new IntentFilter(z[0]));
    }
}
