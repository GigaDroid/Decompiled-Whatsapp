package com.whatsapp;

import org.v;
import org.whispersystems.at;

public final class ana {
    private static final String z;
    public final boolean a;

    static {
        char[] toCharArray = "wQ\u0003o\u001dJ~\u001ei\u0013_^\u001ei\u0013AVL".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 113;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String toString() {
        return z + this.a + '}';
    }

    public ana(boolean z) {
        this.a = z;
    }
}
