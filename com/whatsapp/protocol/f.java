package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

class f extends a {
    private static final String z;
    final by a;

    static {
        char[] toCharArray = "e*\rpHr".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 79;
                    break;
                case at.i /*2*/:
                    i2 = 96;
                    break;
                case at.o /*3*/:
                    i2 = 31;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    f(by byVar) {
        this.a = byVar;
    }

    public void a(cw cwVar, String str) {
        cw.a(cwVar.a(0), z);
        by.d(this.a).e();
    }
}
