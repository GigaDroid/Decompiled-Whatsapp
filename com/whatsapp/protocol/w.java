package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

class w extends a {
    private static final String[] z;
    final String a;
    final String b;
    final by c;
    final String d;

    static {
        String[] strArr = new String[2];
        String str = "wW=Y\nu[";
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
                        i3 = 7;
                        break;
                    case at.g /*1*/:
                        i3 = 62;
                        break;
                    case at.i /*2*/:
                        i3 = 94;
                        break;
                    case at.o /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 127;
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
                    str = "nZ";
                    obj = null;
            }
        }
    }

    public void a(cw cwVar, String str) {
        cw f = cwVar.f(z[0]);
        String str2 = this.d;
        byte[] bArr = null;
        if (f != null) {
            bArr = f.a;
            str2 = f.b(z[1]);
        }
        if (str != null) {
            by.d(this.c).a(str, str2, bArr, this.b);
        }
    }

    w(by byVar, String str, String str2, String str3) {
        this.c = byVar;
        this.d = str;
        this.b = str2;
        this.a = str3;
    }

    public void a(int i) {
        if (i == 404) {
            by.d(this.c).a(this.a, null, null, this.b);
            if (!co.s) {
                return;
            }
        }
        by.d(this.c).b(this.a, i);
    }
}
