package com.whatsapp;

import org.v;
import org.whispersystems.at;

enum aab {
    ;
    
    public static final aab MAX;
    public static final aab MID;
    public static final aab MIN;
    private static final aab[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\r\u001ao";
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
                        i4 = 64;
                        break;
                    case at.g /*1*/:
                        i4 = 83;
                        break;
                    case at.i /*2*/:
                        i4 = 43;
                        break;
                    case at.o /*3*/:
                        i4 = 8;
                        break;
                    default:
                        i4 = 33;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\r\u0012s";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    MIN = new aab(z[1], 0);
                    MAX = new aab(z[2], 1);
                    MID = new aab(z[0], 2);
                    a = new aab[]{MIN, MAX, MID};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\r\u001ae";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
