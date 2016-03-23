package com.google;

import org.v;
import org.whispersystems.at;

final class fy implements fp {
    private static final String[] z;
    final aX a;
    final Class b;

    static {
        int i;
        String[] strArr = new String[2];
        char[] toCharArray = "uZs%1-^ey".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case v.m /*0*/:
                    i = 89;
                    break;
                case at.g /*1*/:
                    i = 59;
                    break;
                case at.i /*2*/:
                    i = 23;
                    break;
                case at.o /*3*/:
                    i = 68;
                    break;
                default:
                    i = 65;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u001fZt0.+BL08)^_-$+Ze') \u0006".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i = 89;
                    break;
                case at.g /*1*/:
                    i = 59;
                    break;
                case at.i /*2*/:
                    i = 23;
                    break;
                case at.o /*3*/:
                    i = 68;
                    break;
                default:
                    i = 65;
                    break;
            }
            cArr[length] = (char) (i ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    fy(Class cls, aX aXVar) {
        this.b = cls;
        this.a = aXVar;
    }

    public String toString() {
        return z[1] + this.b.getName() + z[0] + this.a + "]";
    }
}
