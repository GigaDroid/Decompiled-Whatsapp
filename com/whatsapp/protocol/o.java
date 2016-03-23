package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

class o extends a {
    private static final String[] z;
    final by a;

    static {
        String[] strArr = new String[6];
        String str = "m^nK";
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
                        i3 = 4;
                        break;
                    case at.g /*1*/:
                        i3 = 42;
                        break;
                    case at.i /*2*/:
                        i3 = 11;
                        break;
                    case at.o /*3*/:
                        i3 = 38;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "rKgS ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "hCxR";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "nCo";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "pS{C";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "u_nT<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(cw cwVar, String str) {
        boolean z = co.s;
        cw a = cwVar.a(0);
        cw.a(a, z[1]);
        cw a2 = a.a(0);
        cw.a(a2, z[3]);
        by.d(this.a).c();
        if (a2.d != null) {
            int i = 0;
            while (i < a2.d.length) {
                cw cwVar2 = a2.d[i];
                cw.a(cwVar2, z[0]);
                if (z[4].equals(cwVar2.b(z[5]))) {
                    String b = cwVar2.b(z[2]);
                    if (b != null) {
                        by.d(this.a).b(b);
                    }
                }
                i++;
                if (z) {
                    break;
                }
            }
        }
        by.d(this.a).d();
    }

    o(by byVar) {
        this.a = byVar;
    }

    public void a(int i) {
        if (i == 404) {
            by.d(this.a).c();
            by.d(this.a).d();
        }
    }
}
