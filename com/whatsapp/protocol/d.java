package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

class d extends a {
    private static final String[] z;
    final ay a;
    final by b;
    final b5 c;

    static {
        String[] strArr = new String[2];
        String str = "@\u0010\u001c,hB\u0016\u0014$";
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
                        i3 = 46;
                        break;
                    case at.g /*1*/:
                        i3 = 127;
                        break;
                    case at.i /*2*/:
                        i3 = 110;
                        break;
                    case at.o /*3*/:
                        i3 = 65;
                        break;
                    default:
                        i3 = 9;
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
                    str = "\\\u001a\u001d4eZ";
                    obj = null;
            }
        }
    }

    public void a(cw cwVar, String str) {
        cw a = cwVar.a(0);
        cw.a(a, z[0]);
        String b = a.b(z[1]);
        if (this.a != null) {
            this.a.a(b);
        }
    }

    d(by byVar, ay ayVar, b5 b5Var) {
        this.b = byVar;
        this.a = ayVar;
        this.c = b5Var;
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }
}
