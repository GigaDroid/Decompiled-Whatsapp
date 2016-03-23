package com.whatsapp;

import android.text.format.Formatter;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class ars implements Runnable {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "!ty]\f.m}]\u00122m}\u0013\u0007,a$\u001f\u0000$mh]\u00008p$\u0013\u0013!me\u0013\u0007,a&";
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
                        i3 = 64;
                        break;
                    case at.g /*1*/:
                        i3 = 4;
                        break;
                    case at.i /*2*/:
                        i3 = 9;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = arj.Theme_buttonStyleSmall;
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
                    str = "`pf\u0006\u0004,9";
                    obj = null;
            }
        }
    }

    ars() {
    }

    public void run() {
        Log.i(z[0] + Formatter.formatFileSize(App.z(), App.T()) + z[1] + Formatter.formatFileSize(App.z(), App.ba()));
    }
}
