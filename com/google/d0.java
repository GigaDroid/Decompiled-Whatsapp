package com.google;

import org.v;
import org.whispersystems.at;

public enum d0 {
    ;
    
    public static final d0 BOOLEAN;
    public static final d0 BYTE_STRING;
    public static final d0 DOUBLE;
    public static final d0 ENUM;
    public static final d0 FLOAT;
    public static final d0 INT;
    public static final d0 LONG;
    public static final d0 MESSAGE;
    public static final d0 STRING;
    private static final d0[] a;
    private static final String[] z;
    private final Object b;

    Object a() {
        return this.b;
    }

    private d0(Object obj) {
        this.b = obj;
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[9];
        char[] toCharArray = "l\u0004i".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "c\u0006r_\u0005".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "`\u0004hS".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "g\u0005rR\u0014d\u0004".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "g\u0013i[\u000ev\u001eoW\u001fb".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "i\u0005sY".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "v\u001eoW\u001fb".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "a\u0005h\\\u001d`".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "h\u000fnM\u0010b\u000f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        z = strArr;
        INT = new d0(z[0], 0, Integer.valueOf(0));
        LONG = new d0(z[5], 1, Long.valueOf(0));
        FLOAT = new d0(z[1], 2, Float.valueOf(0.0f));
        DOUBLE = new d0(z[7], 3, Double.valueOf(0.0d));
        BOOLEAN = new d0(z[3], 4, Boolean.valueOf(false));
        STRING = new d0(z[6], 5, "");
        BYTE_STRING = new d0(z[4], 6, hx.b);
        ENUM = new d0(z[2], 7, null);
        MESSAGE = new d0(z[8], 8, null);
        a = new d0[]{INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }
}
