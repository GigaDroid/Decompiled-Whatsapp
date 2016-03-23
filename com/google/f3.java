package com.google;

import org.v;
import org.whispersystems.at;

final class f3 implements fp {
    private static final String[] z;
    final aX a;
    final Class b;
    final Class c;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "+\u0015e\u0012`s\u0011sN".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 7;
                    break;
                case at.g /*1*/:
                    i2 = 116;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "A\u0015b\u0007\u007fu\rZ\u0007iw\u0011<".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            char c2 = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 7;
                    break;
                case at.g /*1*/:
                    i2 = 116;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[length] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public String toString() {
        boolean z = false;
        int i = bG.l;
        String str = z[1] + this.c.getName() + "+" + this.b.getName() + z[0] + this.a + "]";
        if (i != 0) {
            if (!aX.a) {
                z = true;
            }
            aX.a = z;
        }
        return str;
    }

    f3(Class cls, Class cls2, aX aXVar) {
        this.c = cls;
        this.b = cls2;
        this.a = aXVar;
    }
}
