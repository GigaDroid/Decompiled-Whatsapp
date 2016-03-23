package com.whatsapp.protocol;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class h extends a {
    private static final String[] z;
    final byte[] a;
    final byte[] b;
    final String c;
    final Runnable d;
    final by e;

    static {
        String[] strArr = new String[2];
        String str = "'z\u0011;\u0006+";
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
                        i3 = 68;
                        break;
                    case at.g /*1*/:
                        i3 = 8;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 75;
                        break;
                    default:
                        i3 = 114;
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
                    str = "4i\u001b8\u0005+z\f";
                    obj = null;
            }
        }
    }

    public void a(int i) {
        by.d(this.e).a(i, null, this.c, this.a, this.b, this.d);
    }

    h(by byVar, String str, byte[] bArr, byte[] bArr2, Runnable runnable) {
        this.e = byVar;
        this.c = str;
        this.a = bArr;
        this.b = bArr2;
        this.d = runnable;
    }

    public void a(cw cwVar, String str) {
        cw a = cwVar.a(0);
        cw.a(a, z[0]);
        by.d(this.e).a(0, a.f(z[1]).a, this.c, this.a, this.b, this.d);
    }
}
