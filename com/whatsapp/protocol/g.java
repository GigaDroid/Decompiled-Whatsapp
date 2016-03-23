package com.whatsapp.protocol;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class g extends a {
    private static final String[] z;
    final Runnable a;
    final byte[] b;
    final by c;
    final byte[] d;

    static {
        String[] strArr = new String[4];
        String str = ")V\u000e{";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 57;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 30;
                        break;
                    default:
                        i3 = 79;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "<\\\u0018m&%W";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ":X\u0019m8%K\u000e";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ")K\u0013n;%";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    g(by byVar, byte[] bArr, byte[] bArr2, Runnable runnable) {
        this.c = byVar;
        this.d = bArr;
        this.b = bArr2;
        this.a = runnable;
    }

    public void a(cw cwVar, String str) {
        cw a = cwVar.a(0);
        cw.a(a, z[1]);
        by.d(this.c).a(a.b(z[2]), a.f(z[0]).a, a.f(z[3]).a, this.d, this.b, this.a);
    }
}
