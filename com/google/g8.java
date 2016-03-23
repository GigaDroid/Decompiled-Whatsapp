package com.google;

import org.v;
import org.whispersystems.at;

enum g8 {
    ;
    
    public static final g8 AGGREGATES_ONLY;
    public static final g8 ALL_SYMBOLS;
    public static final g8 TYPES_ONLY;
    private static final g8[] a;
    private static final String[] z;

    static {
        int i;
        int i2;
        String[] strArr = new String[3];
        char[] toCharArray = "Ok\bY)D}\u0016P#".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 27;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 88;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 122;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "Z~\u0014C)B\u007f\u001aS6H".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 27;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 88;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 122;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "Zu\u001fN?\\s\fY)D}\u0016P#".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 27;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 88;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 122;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
        TYPES_ONLY = new g8(z[0], 0);
        AGGREGATES_ONLY = new g8(z[2], 1);
        ALL_SYMBOLS = new g8(z[1], 2);
        a = new g8[]{TYPES_ONLY, AGGREGATES_ONLY, ALL_SYMBOLS};
    }
}
