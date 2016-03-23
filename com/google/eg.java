package com.google;

import org.v;
import org.whispersystems.at;

public enum eg implements ia {
    ;
    
    public static final eg IDENTITY;
    public static final eg LOWER_CASE_WITH_DASHES;
    public static final eg LOWER_CASE_WITH_UNDERSCORES;
    public static final eg UPPER_CAMEL_CASE;
    public static final eg UPPER_CAMEL_CASE_WITH_SPACES;
    private static final eg[] a;
    private static final String[] z;

    eg(fd fdVar) {
        this(r1, r2);
    }

    private static String b(String str, String str2) {
        boolean z = hH.a;
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && stringBuilder.length() != 0) {
                stringBuilder.append(str2);
            }
            stringBuilder.append(charAt);
            i++;
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    private static String b(String str) {
        boolean z = hH.a;
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        while (i < str.length() - 1 && (!Character.isLetter(charAt) || z)) {
            stringBuilder.append(charAt);
            i++;
            charAt = str.charAt(i);
            if (z) {
                break;
            }
        }
        if (i == str.length()) {
            return stringBuilder.toString();
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return stringBuilder.append(a(Character.toUpperCase(charAt), str, i + 1)).toString();
    }

    private static String a(char c, String str, int i) {
        return i < str.length() ? c + str.substring(i) : String.valueOf(c);
    }

    static String a(String str) {
        return b(str);
    }

    static {
        int i;
        String[] strArr = new String[5];
        char[] toCharArray = "B|Ee\u000fHoTm\u0018[sVa\u000eR".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 21;
                    break;
                case at.o /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "[cBe\u000fHoTs\u0018H{\\t\u0015HhTs\u0015R\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 21;
                    break;
                case at.o /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "^hPn\t^xL".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 21;
                    break;
                case at.o /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "B|Ee\u000fHoTm\u0018[sVa\u000eRsBi\t_sFp\u001cTiF".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 21;
                    break;
                case at.o /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "[cBe\u000fHoTs\u0018H{\\t\u0015Hy[d\u0018E\u007fVo\u000fR\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 21;
                    break;
                case at.o /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
        IDENTITY = new fd(z[2], 0);
        UPPER_CAMEL_CASE = new fj(z[0], 1);
        UPPER_CAMEL_CASE_WITH_SPACES = new fF(z[3], 2);
        LOWER_CASE_WITH_UNDERSCORES = new f8(z[4], 3);
        LOWER_CASE_WITH_DASHES = new ft(z[1], 4);
        a = new eg[]{IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES};
    }

    static String a(String str, String str2) {
        return b(str, str2);
    }
}
