package com.whatsapp;

import org.v;
import org.whispersystems.at;

public final class f {
    private static final String z;
    public final String a;

    static {
        char[] toCharArray = "+FQo(\u001eRmf)\u000e[LH\"\u0013{Hf)\u001eEYq(\u001fNtj#W\u0019".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.g /*1*/:
                    i2 = 62;
                    break;
                case at.i /*2*/:
                    i2 = 62;
                    break;
                case at.o /*3*/:
                    i2 = 3;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String toString() {
        return z + this.a + '\'' + '}';
    }

    public f(String str) {
        this.a = str;
    }
}
