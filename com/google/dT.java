package com.google;

import org.v;
import org.whispersystems.at;

final class dT implements fp {
    private static final String[] z;
    final Class a;
    final aX b;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "\r}>Z}Uy(\u0006".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 28;
                    break;
                case at.i /*2*/:
                    i2 = 90;
                    break;
                case at.o /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "g}9ObSe\u0001OtQyg".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 28;
                    break;
                case at.i /*2*/:
                    i2 = 90;
                    break;
                case at.o /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public String toString() {
        return z[1] + this.a.getName() + z[0] + this.b + "]";
    }

    dT(Class cls, aX aXVar) {
        this.a = cls;
        this.b = aXVar;
    }
}
