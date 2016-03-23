package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

class ag extends a {
    private static final String[] z;
    final by a;

    static {
        String[] strArr = new String[3];
        String str = "%er@g:{~";
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
                        i3 = 85;
                        break;
                    case at.g /*1*/:
                        i3 = 9;
                        break;
                    case at.i /*2*/:
                        i3 = 19;
                        break;
                    case at.o /*3*/:
                        i3 = 52;
                        break;
                    default:
                        i3 = 1;
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
                    str = "<m";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "6f}Rh2";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ag(by byVar) {
        this.a = byVar;
    }

    public void a(int i) {
        if (i == 404) {
            by.d(this.a).j(null, null);
            if (!co.s) {
                return;
            }
        }
        by.d(this.a).c(i);
    }

    public void a(cw cwVar, String str) {
        cw a = cwVar.a(0);
        cw.a(a, z[1]);
        by.d(this.a).j(a.b(z[0]), a.b(z[2]));
    }
}
