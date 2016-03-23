package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

class x extends a {
    private static final String[] z;
    final b5 a;
    final ay b;
    final by c;
    final boolean d;

    static {
        String[] strArr = new String[2];
        String str = "oYr9GmU";
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
                        i3 = 31;
                        break;
                    case at.g /*1*/:
                        i3 = 48;
                        break;
                    case at.i /*2*/:
                        i3 = 17;
                        break;
                    case at.o /*3*/:
                        i3 = 77;
                        break;
                    default:
                        i3 = 50;
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
                    str = "vT";
                    obj = null;
            }
        }
    }

    x(by byVar, ay ayVar, boolean z, b5 b5Var) {
        this.c = byVar;
        this.b = ayVar;
        this.d = z;
        this.a = b5Var;
    }

    public void a(cw cwVar, String str) {
        if (this.b != null) {
            String str2 = null;
            if (!this.d) {
                cw a = cwVar.a(0);
                cw.a(a, z[0]);
                str2 = a.b(z[1]);
            }
            this.b.a(str2);
        }
    }

    public void a(int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }
}
