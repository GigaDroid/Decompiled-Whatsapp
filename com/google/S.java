package com.google;

import org.v;
import org.whispersystems.at;

enum S {
    ;
    
    public static final S BINARY;
    public static final S DIGIT;
    public static final S LOWER;
    public static final S MIXED;
    public static final S PUNCT;
    public static final S UPPER;
    private static final S[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "\u0005\u0001\\61\u001e";
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
                        i4 = 71;
                        break;
                    case at.g /*1*/:
                        i4 = 72;
                        break;
                    case at.i /*2*/:
                        i4 = 18;
                        break;
                    case at.o /*3*/:
                        i4 = 119;
                        break;
                    default:
                        i4 = 99;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0012\u0018B21";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u000b\u0007E21";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0003\u0001U>7";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0017\u001d\\47";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    UPPER = new S(z[2], 0);
                    LOWER = new S(z[3], 1);
                    MIXED = new S(z[1], 2);
                    DIGIT = new S(z[4], 3);
                    PUNCT = new S(z[5], 4);
                    BINARY = new S(z[0], 5);
                    a = new S[]{UPPER, LOWER, MIXED, DIGIT, PUNCT, BINARY};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\n\u0001J2'";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
