package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum v4 {
    ;
    
    public static final v4 ERROR_CONNECTIVITY;
    public static final v4 ERROR_UNSPECIFIED;
    public static final v4 FAIL_BLOCKED;
    public static final v4 FAIL_GUESSED_TOO_FAST;
    public static final v4 FAIL_MISMATCH;
    public static final v4 FAIL_MISSING;
    public static final v4 FAIL_STALE;
    public static final v4 FAIL_TEMPORARILY_UNAVAILABLE;
    public static final v4 FAIL_TOO_MANY_GUESSES;
    public static final v4 YES;
    private static final v4[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[10];
        String str = "\bel";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 81;
                        break;
                    case at.g /*1*/:
                        i4 = 32;
                        break;
                    case at.i /*2*/:
                        i4 = 63;
                        break;
                    case at.o /*3*/:
                        i4 = 88;
                        break;
                    default:
                        i4 = 115;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0017av\u0014,\u0016uz\u000b \u0014d`\f<\u001e\u007fy\u0019 \u0005";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0014rm\u0017!\u000euq\u000b#\u0014cv\u001e:\u0014d";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0017av\u0014,\u0013lp\u001b8\u0014d";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0014rm\u0017!\u000ecp\u0016=\u0014ck\u0011%\u0018tf";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0017av\u0014,\u0002t~\u00146";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0017av\u0014,\u001cil\u00152\u0005cw";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0017av\u0014,\u001cil\u000b:\u001fg";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u0017av\u0014,\u0005op\u0007>\u0010nf\u00074\u0004el\u000b6\u0002";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    YES = new v4(z[0], 0);
                    ERROR_UNSPECIFIED = new v4(z[3], 1);
                    ERROR_CONNECTIVITY = new v4(z[5], 2);
                    FAIL_MISMATCH = new v4(z[7], 3);
                    FAIL_TOO_MANY_GUESSES = new v4(z[9], 4);
                    FAIL_GUESSED_TOO_FAST = new v4(z[2], 5);
                    FAIL_MISSING = new v4(z[8], 6);
                    FAIL_STALE = new v4(z[6], 7);
                    FAIL_TEMPORARILY_UNAVAILABLE = new v4(z[1], 8);
                    FAIL_BLOCKED = new v4(z[4], 9);
                    a = new v4[]{YES, ERROR_UNSPECIFIED, ERROR_CONNECTIVITY, FAIL_MISMATCH, FAIL_TOO_MANY_GUESSES, FAIL_GUESSED_TOO_FAST, FAIL_MISSING, FAIL_STALE, FAIL_TEMPORARILY_UNAVAILABLE, FAIL_BLOCKED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0017av\u0014,\u0005er\b<\u0003am\u0011?\b\u007fj\u00162\u0007av\u00142\u0013lz";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
