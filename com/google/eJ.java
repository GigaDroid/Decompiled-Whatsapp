package com.google;

import org.v;
import org.whispersystems.at;

public final class eJ extends RuntimeException {
    private static final long serialVersionUID = 5469741279507848266L;
    private static final String z;

    static {
        char[] toCharArray = "fqW7-`i]\u0007l^u\\%nY9I%~\u0012xR6hS}GdnSuR!i\u0012xP -QxP*bF9\\!-QxR(hV9S1aFpN(h\u0012mW)hA7".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 50;
                    break;
                case at.g /*1*/:
                    i2 = 25;
                    break;
                case at.i /*2*/:
                    i2 = 62;
                    break;
                case at.o /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public eJ() {
        super(z);
    }
}
