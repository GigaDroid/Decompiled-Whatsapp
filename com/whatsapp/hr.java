package com.whatsapp;

import android.os.Process;
import org.v;
import org.whispersystems.at;

public class hr {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u0017\u000b^^\u0015\u0017";
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
                        i3 = 56;
                        break;
                    case at.g /*1*/:
                        i3 = 123;
                        break;
                    case at.i /*2*/:
                        i3 = 44;
                        break;
                    case at.o /*3*/:
                        i3 = 49;
                        break;
                    default:
                        i3 = 118;
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
                    str = "\u0017\u0018KC\u0019M\u000b";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0002\u0018\\DL\u0017\u001a\\A\u0005\u0017\u0019Kn\u0018W\u0015sX\u0018L\u001e^P\u0015L\u0012ZT";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean a() {
        boolean z = false;
        try {
            String a = amp.a(z[0] + Process.myPid() + z[2]);
            if (a != null) {
                z = a.contains(z[1]);
            }
        } catch (RuntimeException e) {
        }
        return z;
    }
}
