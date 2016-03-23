package com.whatsapp;

import org.v;
import org.whispersystems.at;

public final class a47 {
    private static final String z;
    public final boolean a;

    static {
        char[] toCharArray = "3\u0013\u0019Kh\u0019\u00139]{\b\u001f\t]J\u0011\u0018\u0004]j\n\u001f\u001cQ}\u0007\r\tWg\u0010\u0013\tLl\u001aK".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 118;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 56;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String toString() {
        return z + this.a + '}';
    }

    public a47(boolean z) {
        this.a = z;
    }
}
