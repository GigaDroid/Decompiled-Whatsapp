package com.google;

import org.v;
import org.whispersystems.at;

public enum go {
    ;
    
    public static final go EXACT_GROUPING;
    public static final go POSSIBLE;
    public static final go STRICT_GROUPING;
    public static final go VALID;
    private static final go[] a;
    private static final String[] z;

    abstract boolean a(ae aeVar, String str, e2 e2Var);

    go(c cVar) {
        this(r1, r2);
    }

    static {
        String[] strArr = new String[4];
        String str = "\u0000~\\ON\u001aaOCO\u0015oSK";
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
                        i4 = 69;
                        break;
                    case at.g /*1*/:
                        i4 = 38;
                        break;
                    case at.i /*2*/:
                        i4 = 29;
                        break;
                    case at.o /*3*/:
                        i4 = 12;
                        break;
                    default:
                        i4 = 26;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0015iN_S\u0007jX";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0016rOEY\u0011yZ^U\u0010vTB]";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    POSSIBLE = new gz(z[2], 0);
                    VALID = new ga(z[1], 1);
                    STRICT_GROUPING = new gi(z[3], 2);
                    EXACT_GROUPING = new gw(z[0], 3);
                    a = new go[]{POSSIBLE, VALID, STRICT_GROUPING, EXACT_GROUPING};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0013gQE^";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
