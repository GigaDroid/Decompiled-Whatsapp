package com.google;

import org.v;
import org.whispersystems.at;

final class dg implements fp {
    private static final String[] z;
    final aX a;
    final Class b;
    final Class c;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = ")G!Rq\u001d_\u0019Rg\u001fC\u007f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 111;
                    break;
                case at.g /*1*/:
                    i2 = 38;
                    break;
                case at.i /*2*/:
                    i2 = 66;
                    break;
                case at.o /*3*/:
                    i2 = 38;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "CG&Gn\u001bC0\u001b".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 111;
                    break;
                case at.g /*1*/:
                    i2 = 38;
                    break;
                case at.i /*2*/:
                    i2 = 66;
                    break;
                case at.o /*3*/:
                    i2 = 38;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public String toString() {
        int i = bG.l;
        String str = z[0] + this.b.getName() + "+" + this.c.getName() + z[1] + this.a + "]";
        if (aX.a) {
            bG.l = i + 1;
        }
        return str;
    }

    dg(Class cls, Class cls2, aX aXVar) {
        this.c = cls;
        this.b = cls2;
        this.a = aXVar;
    }
}
