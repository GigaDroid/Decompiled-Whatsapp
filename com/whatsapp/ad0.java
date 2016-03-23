package com.whatsapp;

import android.telephony.PhoneStateListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ad0 extends PhoneStateListener {
    private static final String[] z;
    final App a;

    static {
        String[] strArr = new String[3];
        String str = "\u001c\u0001\u0015vJC\u001a\u000ey[\tI\u0013|C\t";
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
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 122;
                        break;
                    case at.o /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 47;
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
                    str = "\u001c\u0001\u0015vJC\u001a\u000ey[\tI\u0015~I\u0004\u0006\u0015s";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001c\u0001\u0015vJC\u001a\u000ey[\tI\bqA\u000b\u0000\u0014\u007f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ad0(App app) {
        this.a = app;
    }

    public void onCallStateChanged(int i, String str) {
        boolean z = DialogToastActivity.f;
        switch (i) {
            case v.m /*0*/:
                break;
            case at.g /*1*/:
                Log.i(z[1]);
                i8.m();
                if (!z) {
                    return;
                }
                break;
            case at.i /*2*/:
                break;
            default:
                return;
        }
        Log.i(z[2]);
        if (!z) {
            return;
        }
        Log.i(z[0]);
    }
}
