package com.whatsapp.gcm;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class GcmReceiver extends com.google.android.gms.gcm.GcmReceiver {
    private static final String z;

    static {
        char[] toCharArray = "#1p\u0007R ;o\u000f\u001b#-t\r\u001c#~o\u0007\u001e1*x\u0006R>1s\u0011\u0017>-xB\u001a1.m\u0007\u001c5:=\u0015\u001a92xB\u00005=x\u000b\u000490zB\u0013p9~\u000fR2,r\u0003\u00163?n\u0016".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 80;
                    break;
                case at.g /*1*/:
                    i2 = 94;
                    break;
                case at.i /*2*/:
                    i2 = 29;
                    break;
                case at.o /*3*/:
                    i2 = 98;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onReceive(Context context, Intent intent) {
        try {
            super.onReceive(context, intent);
        } catch (Throwable e) {
            Log.b(z, e);
        }
    }
}
