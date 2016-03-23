package com.google;

import org.v;
import org.whispersystems.at;

public enum dk {
    ;
    
    public static final dk INVALID_COUNTRY_CODE;
    public static final dk NOT_A_NUMBER;
    public static final dk TOO_LONG;
    public static final dk TOO_SHORT_AFTER_IDD;
    public static final dk TOO_SHORT_NSN;
    private static final dk[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "\\5'O3\\?.M0@5%\\&J8>J:";
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
                        i4 = 21;
                        break;
                    case at.g /*1*/:
                        i4 = 123;
                        break;
                    case at.i /*2*/:
                        i4 = 113;
                        break;
                    case at.o /*3*/:
                        i4 = 14;
                        break;
                    default:
                        i4 = 127;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "[4%Q>J5$C=P)";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "A4>Q,]4#Z T=%K-J25J";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "A4>Q,]4#Z [(?";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    INVALID_COUNTRY_CODE = new dk(z[0], 0);
                    NOT_A_NUMBER = new dk(z[2], 1);
                    TOO_SHORT_AFTER_IDD = new dk(z[3], 2);
                    TOO_SHORT_NSN = new dk(z[4], 3);
                    TOO_LONG = new dk(z[1], 4);
                    a = new dk[]{INVALID_COUNTRY_CODE, NOT_A_NUMBER, TOO_SHORT_AFTER_IDD, TOO_SHORT_NSN, TOO_LONG};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "A4>Q3Z56";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
