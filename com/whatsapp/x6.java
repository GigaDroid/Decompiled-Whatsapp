package com.whatsapp;

import org.v;
import org.whispersystems.at;

public final class x6 {
    private static final String z;
    public final boolean a;

    static {
        char[] toCharArray = "\u0003\u0006\u0015Ou\u0000\b\u0014OJ<\r\u0007io2\u0007\u0005O|#\u0006\u0015Ou\u0000\b\u0014OJ<\r\u0007\u0017".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 42;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String toString() {
        return z + this.a + '}';
    }

    public x6(boolean z) {
        this.a = z;
    }
}
