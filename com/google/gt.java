package com.google;

import org.v;
import org.whispersystems.at;

enum gt {
    ;
    
    public static final gt ANSIX12_ENCODE;
    public static final gt ASCII_ENCODE;
    public static final gt BASE256_ENCODE;
    public static final gt C40_ENCODE;
    public static final gt EDIFACT_ENCODE;
    public static final gt PAD_ENCODE;
    public static final gt TEXT_ENCODE;
    private static final gt[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "\f\u0000N07\u0012\u0002E+7";
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
                        i4 = 92;
                        break;
                    case at.g /*1*/:
                        i4 = 65;
                        break;
                    case at.i /*2*/:
                        i4 = 10;
                        break;
                    case at.o /*3*/:
                        i4 = 111;
                        break;
                    default:
                        i4 = 114;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u001e\u0000Y*@iwU*<\u001f\u000eN*";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u001d\u000fY&*msU*<\u001f\u000eN*";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u001fu:07\u0012\u0002E+7";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\b\u0004R;-\u0019\u000fI 6\u0019";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0019\u0005C)3\u001f\u0015U*<\u001f\u000eN*";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    PAD_ENCODE = new gt(z[0], 0);
                    ASCII_ENCODE = new gt(z[1], 1);
                    C40_ENCODE = new gt(z[4], 2);
                    TEXT_ENCODE = new gt(z[5], 3);
                    ANSIX12_ENCODE = new gt(z[3], 4);
                    EDIFACT_ENCODE = new gt(z[6], 5);
                    BASE256_ENCODE = new gt(z[2], 6);
                    a = new gt[]{PAD_ENCODE, ASCII_ENCODE, C40_ENCODE, TEXT_ENCODE, ANSIX12_ENCODE, EDIFACT_ENCODE, BASE256_ENCODE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001d\u0012I&;\u0003\u0004D,=\u0018\u0004";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
