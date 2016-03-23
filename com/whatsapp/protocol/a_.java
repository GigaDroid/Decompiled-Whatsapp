package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

class a_ extends a {
    private static final String[] z;
    final by a;
    final bd b;

    static {
        String[] strArr = new String[3];
        String str = "\"\u001b0\u007f`*\u00107d^";
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
                        i3 = 71;
                        break;
                    case at.g /*1*/:
                        i3 = 117;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 13;
                        break;
                    default:
                        i3 = 63;
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
                    str = ".\u0005";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "2\u0007?";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(cw cwVar, String str) {
        cw a = cw.a(cwVar.f(z[0]));
        String d = a.d(z[1]);
        String b = a.b(z[2]);
        if (this.b != null) {
            this.b.a(d, b, 0);
        }
    }

    a_(by byVar, bd bdVar) {
        this.a = byVar;
        this.b = bdVar;
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }
}
