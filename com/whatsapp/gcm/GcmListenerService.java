package com.whatsapp.gcm;

import android.os.Bundle;
import org.v;
import org.whispersystems.at;

public class GcmListenerService extends com.google.android.gms.gcm.GcmListenerService {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "</";
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
                        i3 = 85;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 120;
                        break;
                    case at.o /*3*/:
                        i3 = 100;
                        break;
                    default:
                        i3 = 72;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "3=\u0011\u0014;";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "<;";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "!,";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "82\u000b\u000b>";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDeletedMessages() {
        a.a(this, null, null, null, null, null, true);
    }

    public void onMessageReceived(String str, Bundle bundle) {
        a.a(this, bundle.getString(z[3]), bundle.getString(z[0]), bundle.getString(z[4]), bundle.getString(z[1]), bundle.getString(z[2]), true);
    }
}
