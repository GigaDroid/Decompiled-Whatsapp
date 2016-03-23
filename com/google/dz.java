package com.google;

import org.v;
import org.whispersystems.at;

public enum dz {
    ;
    
    public static final dz INVALID_COUNTRY_CODE;
    public static final dz IS_POSSIBLE;
    public static final dz TOO_LONG;
    public static final dz TOO_SHORT;
    private static final dz[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = ",oK +0oV+";
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
                        i4 = 120;
                        break;
                    case at.g /*1*/:
                        i4 = 32;
                        break;
                    case at.i /*2*/:
                        i4 = 4;
                        break;
                    case at.o /*3*/:
                        i4 = 127;
                        break;
                    default:
                        i4 = 120;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = ",oK 47nC";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "1nR>41d[<7-nP-!'cK;=";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    IS_POSSIBLE = new dz(z[1], 0);
                    INVALID_COUNTRY_CODE = new dz(z[3], 1);
                    TOO_SHORT = new dz(z[0], 2);
                    TOO_LONG = new dz(z[2], 3);
                    a = new dz[]{IS_POSSIBLE, INVALID_COUNTRY_CODE, TOO_SHORT, TOO_LONG};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "1s[/7+sM=4=";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
