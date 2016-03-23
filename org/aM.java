package org;

import com.whatsapp.arj;
import org.whispersystems.at;

public enum aM {
    ;
    
    public static final aM CRAM_MD5;
    public static final aM LOGIN;
    public static final aM PLAIN;
    public static final aM XOAUTH;
    private static final aM[] a;
    private static final String[] z;

    static {
        int i;
        int i2;
        String[] strArr = new String[8];
        char[] toCharArray = "qqQ%1".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "yrQ9+i".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "boQ!Rly%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "mrW%1".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "qqQ%1".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "mrW%1".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "boQ! ly%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "yrQ9+i".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        z = strArr;
        PLAIN = new aM(z[4], 0);
        CRAM_MD5 = new aM(z[6], 1);
        LOGIN = new aM(z[5], 2);
        XOAUTH = new aM(z[7], 3);
        a = new aM[]{PLAIN, CRAM_MD5, LOGIN, XOAUTH};
    }

    public static final String getAuthName(aM aMVar) {
        if (aMVar.equals(PLAIN)) {
            return z[0];
        }
        if (aMVar.equals(CRAM_MD5)) {
            return z[2];
        }
        if (aMVar.equals(LOGIN)) {
            return z[3];
        }
        if (aMVar.equals(XOAUTH)) {
            return z[1];
        }
        return null;
    }
}
