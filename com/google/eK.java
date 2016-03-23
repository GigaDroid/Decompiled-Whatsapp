package com.google;

import org.v;
import org.whispersystems.at;

public enum eK {
    ;
    
    public static final eK BOOL;
    public static final eK BYTES;
    public static final eK DOUBLE;
    public static final eK ENUM;
    public static final eK FIXED32;
    public static final eK FIXED64;
    public static final eK FLOAT;
    public static final eK GROUP;
    public static final eK INT32;
    public static final eK INT64;
    public static final eK MESSAGE;
    public static final eK SFIXED32;
    public static final eK SFIXED64;
    public static final eK SINT32;
    public static final eK SINT64;
    public static final eK STRING;
    public static final eK UINT32;
    public static final eK UINT64;
    private static final eK[] a;
    private static final String[] z;
    private final int b;
    private final d0 c;

    eK(d0 d0Var, int i, gq gqVar) {
        this(r1, r2, d0Var, i);
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[18];
        char[] toCharArray = ")\u001b\u0014;S>ki".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "8\u0004\t&E".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "<\u0014\u0005&RIo".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "3\u0013\tU\"".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = ">\u0012\b!Z?".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "<\u0011\u0012\"B".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "8\u0012\u0012/".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = ")\t\u000f*X=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "7\u0018\u000e0W=\u0018".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "?\u0013\b.".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = ")\u0014\u00137 N".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "/\u0014\u00137 N".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "3\u0013\tP$".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "<\u0014\u0005&RLi".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = ")\u001b\u0014;S>no".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = ")\u0014\u00137%H".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "=\u000f\u00126F".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "/\u0014\u00137%H".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        z = strArr;
        DOUBLE = new eK(z[4], 0, d0.DOUBLE, 1);
        FLOAT = new eK(z[5], 1, d0.FLOAT, 5);
        INT64 = new eK(z[3], 2, d0.LONG, 0);
        UINT64 = new eK(z[11], 3, d0.LONG, 0);
        INT32 = new eK(z[12], 4, d0.INT, 0);
        FIXED64 = new eK(z[13], 5, d0.LONG, 1);
        FIXED32 = new eK(z[2], 6, d0.INT, 5);
        BOOL = new eK(z[6], 7, d0.BOOLEAN, 0);
        STRING = new eC(z[7], 8, d0.STRING, 2);
        GROUP = new eG(z[16], 9, d0.MESSAGE, 3);
        MESSAGE = new eN(z[8], 10, d0.MESSAGE, 2);
        BYTES = new ek(z[1], 11, d0.BYTE_STRING, 2);
        UINT32 = new eK(z[17], 12, d0.INT, 0);
        ENUM = new eK(z[9], 13, d0.ENUM, 0);
        SFIXED32 = new eK(z[14], 14, d0.INT, 5);
        SFIXED64 = new eK(z[0], 15, d0.LONG, 1);
        SINT32 = new eK(z[15], 16, d0.INT, 0);
        SINT64 = new eK(z[10], 17, d0.LONG, 0);
        a = new eK[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
    }

    private eK(d0 d0Var, int i) {
        this.c = d0Var;
        this.b = i;
    }

    public int getWireType() {
        return this.b;
    }

    public d0 getJavaType() {
        return this.c;
    }

    public boolean isPackable() {
        return true;
    }
}
