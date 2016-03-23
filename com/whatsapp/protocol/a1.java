package com.whatsapp.protocol;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class a1 extends a {
    private static final String[] z;
    final by a;

    static {
        String[] strArr = new String[8];
        String str = "\u0010@\u0002E";
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
                        i3 = 100;
                        break;
                    case at.g /*1*/:
                        i3 = 57;
                        break;
                    case at.i /*2*/:
                        i3 = 114;
                        break;
                    case at.o /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0017R\u0017Y";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\fX\u0001H";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\bP\u0001T";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0000P\u0015E\u0019\u0010";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0016\\\u0015I\u0019\u0010K\u0013T\u0003\u000bW";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\r]";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\r]";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
        if (i == 404) {
            by.a(this.a).a();
            if (!co.s) {
                return;
            }
        }
        if (i == 503) {
            by.a(this.a).b();
        }
    }

    public void a(cw cwVar, String str) {
        int length;
        boolean z = co.s;
        cw a = cw.a(cwVar.f(z[5]));
        cw a2 = cw.a(a.f(z[6]));
        cw a3 = cw.a(a.f(z[0]));
        cw a4 = cw.a(cw.a(a.f(z[2])).f(z[7]));
        cw a5 = cw.a(a.f(z[4]));
        cw a6 = cw.a(a.f(z[3]));
        if (a5.d != null) {
            length = a5.d.length;
        } else {
            length = 0;
        }
        byte[][] bArr = new byte[length][];
        int i = 0;
        while (i < length) {
            cw.a(a5.d[i], z[1]);
            bArr[i] = cw.a(a5.d[i], 3);
            i++;
            if (z) {
                break;
            }
        }
        by.a(this.a).a(cw.a(a2, 4), cw.a(a3, 1)[0], cw.a(a4, 3), bArr, cw.a(a6, 20));
    }

    a1(by byVar) {
        this.a = byVar;
    }
}
