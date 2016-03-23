package com.google;

import org.v;
import org.whispersystems.at;

public enum fS {
    ;
    
    public static final fS BOOL;
    public static final fS BYTES;
    public static final fS DOUBLE;
    public static final fS ENUM;
    public static final fS FIXED32;
    public static final fS FIXED64;
    public static final fS FLOAT;
    public static final fS GROUP;
    public static final fS INT32;
    public static final fS INT64;
    public static final fS MESSAGE;
    public static final fS SFIXED32;
    public static final fS SFIXED64;
    public static final fS SINT32;
    public static final fS SINT64;
    public static final fS STRING;
    public static final fS UINT32;
    public static final fS UINT64;
    private static final fS[] a;
    private static final String[] z;
    private fD b;

    private fS(fD fDVar) {
        this.b = fDVar;
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[18];
        char[] toCharArray = "gx||c".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "mo`zrgo".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "be|e".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "idg\u001f\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "uc}}\u0005\u0014".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "uc}}\u0000\u0012".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "sc}}\u0005\u0014".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "fcklw\u0013\u0018".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "sc}}\u0000\u0012".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "fcklw\u0016\u001e".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "ff|hg".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "slzqvd\u0019\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "slzqvd\u001c\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "s~a`}g".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "bsgl`".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = "edfd".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "idg\u001a\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "defk\u007fe".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        z = strArr;
        DOUBLE = new fS(z[17], 0, fD.DOUBLE);
        FLOAT = new fS(z[10], 1, fD.FLOAT);
        INT64 = new fS(z[3], 2, fD.LONG);
        UINT64 = new fS(z[4], 3, fD.LONG);
        INT32 = new fS(z[16], 4, fD.INT);
        FIXED64 = new fS(z[9], 5, fD.LONG);
        FIXED32 = new fS(z[7], 6, fD.INT);
        BOOL = new fS(z[2], 7, fD.BOOLEAN);
        STRING = new fS(z[13], 8, fD.STRING);
        GROUP = new fS(z[0], 9, fD.MESSAGE);
        MESSAGE = new fS(z[1], 10, fD.MESSAGE);
        BYTES = new fS(z[14], 11, fD.BYTE_STRING);
        UINT32 = new fS(z[5], 12, fD.INT);
        ENUM = new fS(z[15], 13, fD.ENUM);
        SFIXED32 = new fS(z[11], 14, fD.INT);
        SFIXED64 = new fS(z[12], 15, fD.LONG);
        SINT32 = new fS(z[8], 16, fD.INT);
        SINT64 = new fS(z[6], 17, fD.LONG);
        a = new fS[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
    }

    public static fS valueOf(iq iqVar) {
        return values()[iqVar.getNumber() - 1];
    }

    public fD getJavaType() {
        return this.b;
    }

    public iq toProto() {
        return iq.valueOf(ordinal() + 1);
    }
}
