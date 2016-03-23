package com.google;

import org.v;
import org.whispersystems.at;

public enum dE {
    ;
    
    public static final dE FORCE_NONE;
    public static final dE FORCE_RECTANGLE;
    public static final dE FORCE_SQUARE;
    public static boolean b;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\ty,q\u0002\u0010d;q\u0013\u000ex9~\u0002";
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
                        i4 = 79;
                        break;
                    case at.g /*1*/:
                        i4 = 54;
                        break;
                    case at.i /*2*/:
                        i4 = 126;
                        break;
                    case at.o /*3*/:
                        i4 = 50;
                        break;
                    default:
                        i4 = 71;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\ty,q\u0002\u0010x1|\u0002";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FORCE_NONE = new dE(z[2], 0);
                    FORCE_SQUARE = new dE(z[1], 1);
                    FORCE_RECTANGLE = new dE(z[0], 2);
                    a = new dE[]{FORCE_NONE, FORCE_SQUARE, FORCE_RECTANGLE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\ty,q\u0002\u0010e/g\u0006\u001ds";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
