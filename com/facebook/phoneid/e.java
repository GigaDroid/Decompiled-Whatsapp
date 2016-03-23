package com.facebook.phoneid;

import org.v;
import org.whispersystems.at;

public final class e {
    public static boolean a;
    private static final String z;
    public final long b;
    public final String c;

    static {
        char[] toCharArray = "p\u0001\\".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 80;
                    break;
                case at.g /*1*/:
                    i2 = 59;
                    break;
                case at.i /*2*/:
                    i2 = 124;
                    break;
                case at.o /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String toString() {
        return this.c + z + this.b;
    }

    public e(String str, long j) {
        this.c = str;
        this.b = j;
    }
}
