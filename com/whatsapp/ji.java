package com.whatsapp;

import org.v;
import org.whispersystems.at;

public final class ji {
    private static final String z;
    public final String a;

    static {
        char[] toCharArray = "\u0007c\u000b(k2w7!w5r\u000b*A0~\n0\u007f,r\u0000y#".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 70;
                    break;
                case at.g /*1*/:
                    i2 = 27;
                    break;
                case at.i /*2*/:
                    i2 = 100;
                    break;
                case at.o /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public ji(String str) {
        this.a = str;
    }

    public String toString() {
        return z + this.a + '\'' + '}';
    }
}
