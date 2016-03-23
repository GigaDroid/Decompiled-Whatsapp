package com.google;

import org.v;
import org.whispersystems.at;

public enum d5 {
    ;
    
    public static final d5 EXACT_MATCH;
    public static final d5 NOT_A_NUMBER;
    public static final d5 NO_MATCH;
    public static final d5 NSN_MATCH;
    public static final d5 SHORT_NSN_MATCH;
    private static final d5[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "HA8W\u000eGF5@";
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
                        i4 = 6;
                        break;
                    case at.g /*1*/:
                        i4 = 18;
                        break;
                    case at.i /*2*/:
                        i4 = 118;
                        break;
                    case at.o /*3*/:
                        i4 = 8;
                        break;
                    default:
                        i4 = 67;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "H])E\u0002RQ>";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "UZ9Z\u0017Y\\%F\u001cKS\"K\u000b";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "CJ7K\u0017Y_7\\\u0000N";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NOT_A_NUMBER = new d5(z[1], 0);
                    NO_MATCH = new d5(z[2], 1);
                    SHORT_NSN_MATCH = new d5(z[3], 2);
                    NSN_MATCH = new d5(z[0], 3);
                    EXACT_MATCH = new d5(z[4], 4);
                    a = new d5[]{NOT_A_NUMBER, NO_MATCH, SHORT_NSN_MATCH, NSN_MATCH, EXACT_MATCH};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "H]\"W\u0002Y\\#E\u0001C@";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
