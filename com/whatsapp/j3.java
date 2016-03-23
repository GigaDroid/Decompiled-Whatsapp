package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum j3 {
    ;
    
    public static final j3 FAILED_GENERIC;
    public static final j3 FAILED_INVALID;
    public static final j3 FAILED_OUT_OF_SPACE;
    public static final j3 SUCCESS;
    private static final j3[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "|D-}?~Z+d.eJ\"n)jD't";
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
                        i4 = 58;
                        break;
                    case at.g /*1*/:
                        i4 = 5;
                        break;
                    case at.i /*2*/:
                        i4 = 100;
                        break;
                    case at.o /*3*/:
                        i4 = 49;
                        break;
                    default:
                        i4 = 122;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "iP'r?iV";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "|D-}?~Z#t4\u007fW-r";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new j3(z[2], 0);
                    FAILED_GENERIC = new j3(z[3], 1);
                    FAILED_OUT_OF_SPACE = new j3(z[0], 2);
                    FAILED_INVALID = new j3(z[1], 3);
                    a = new j3[]{SUCCESS, FAILED_GENERIC, FAILED_OUT_OF_SPACE, FAILED_INVALID};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "|D-}?~Z-\u007f,{I-u";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
