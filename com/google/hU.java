package com.google;

import org.v;
import org.whispersystems.at;

public enum hU {
    ;
    
    public static final hU DEFAULT;
    public static final hU STRING;
    private static final hU[] a;
    private static final String[] z;

    public abstract hH serialize(Long l);

    static {
        int i;
        int i2;
        String[] strArr = new String[2];
        char[] toCharArray = "PQL\u000b\u0006D".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 3;
                    break;
                case at.g /*1*/:
                    i2 = 5;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "G@X\u0003\u001dOQ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 3;
                    break;
                case at.g /*1*/:
                    i2 = 5;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
        DEFAULT = new hl(z[1], 0);
        STRING = new hV(z[0], 1);
        a = new hU[]{DEFAULT, STRING};
    }

    hU(hl hlVar) {
        this(r1, r2);
    }
}
