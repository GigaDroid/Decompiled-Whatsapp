package com.whatsapp;

import android.os.Bundle;
import org.v;
import org.whispersystems.at;

final class fi implements Runnable {
    private static final String[] z;
    final byte[] a;
    final String b;

    static {
        String[] strArr = new String[2];
        String str = "Ur";
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
                        i3 = 39;
                        break;
                    case at.g /*1*/:
                        i3 = 17;
                        break;
                    case at.i /*2*/:
                        i3 = 68;
                        break;
                    case at.o /*3*/:
                        i3 = 5;
                        break;
                    default:
                        i3 = 28;
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
                    str = "Ur\u000elx";
                    obj = null;
            }
        }
    }

    fi(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    public void run() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(z[0], this.a);
        bundle.putString(z[1], this.b);
        App.aD().sendMessage(App.aD().obtainMessage(0, bundle));
    }
}
