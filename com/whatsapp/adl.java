package com.whatsapp;

import android.support.annotation.NonNull;
import org.v;
import org.whispersystems.at;

public final class adl {
    private static final String[] z;
    public boolean a;
    public boolean b;
    public int c;
    public boolean d;
    public final String e;

    static {
        String[] strArr = new String[4];
        String str = "\t}=~SQ\u000e+uY@/\u0005~D\u0018";
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
                        i3 = 37;
                        break;
                    case at.g /*1*/:
                        i3 = 93;
                        break;
                    case at.i /*2*/:
                        i3 = 78;
                        break;
                    case at.o /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 61;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "b/!nMu<<oTF4>zSQ&$rY\u0018z";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\t}>~SA4 |\u0000";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\t}/\u007fPL3s";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean a() {
        return App.as.d(this.e);
    }

    public adl(@NonNull String str, boolean z, boolean z2, boolean z3) {
        this.e = str;
        this.d = z;
        this.b = z2;
        this.a = z3;
    }

    public String toString() {
        return z[2] + this.e + '\'' + z[1] + this.d + z[3] + this.b + z[0] + this.a + '}';
    }
}
