package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

class a4 extends a {
    private static final String[] z;
    final String a;
    final by b;
    final String c;
    final String d;
    final String e;

    static {
        String[] strArr = new String[6];
        String str = "MT]BXLI";
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
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = 61;
                        break;
                    case at.i /*2*/:
                        i3 = 48;
                        break;
                    case at.o /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "IQQSQVO]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "VN";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "JD^D";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "[O_PD\\O";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "MD@B";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a4(by byVar, String str, String str2, String str3, String str4) {
        this.b = byVar;
        this.e = str;
        this.a = str2;
        this.d = str3;
        this.c = str4;
    }

    public void a(int i) {
        by.c(this.b).c(this.e, i);
    }

    public void a(cw cwVar, String str) {
        String b;
        int parseInt;
        boolean z;
        String str2 = null;
        boolean z2 = true;
        if (cwVar != null) {
            cw f = cwVar.f(z[4]);
            if (f != null) {
                cw f2 = f.f(z[2]);
                if (f2 != null) {
                    b = f2.b(z[3]);
                    str2 = f2.b(z[5]);
                    String b2 = f2.b(z[1]);
                    if (b2 != null) {
                        try {
                            parseInt = Integer.parseInt(b2);
                        } catch (NumberFormatException e) {
                            parseInt = 0;
                        }
                    } else {
                        parseInt = 0;
                    }
                } else {
                    parseInt = 0;
                    b = null;
                }
                try {
                    if (f.f(z[0]) == null) {
                        z2 = false;
                    }
                    z = z2;
                    by.c(this.b).a(this.e, this.a, this.d, this.c, b, str2, parseInt, z);
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        }
        z = false;
        parseInt = 0;
        b = null;
        by.c(this.b).a(this.e, this.a, this.d, this.c, b, str2, parseInt, z);
    }
}
