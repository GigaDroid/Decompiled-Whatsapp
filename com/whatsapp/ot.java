package com.whatsapp;

import org.v;
import org.whispersystems.at;

enum ot {
    ;
    
    public static final ot FAILED_GENERIC;
    public static final ot FAILED_OUT_OF_SPACE;
    public static final ot SUCCESS;
    private static final ot[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "_il{C]wjbRFgchUIifr";
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
                        i4 = 25;
                        break;
                    case at.g /*1*/:
                        i4 = 40;
                        break;
                    case at.i /*2*/:
                        i4 = 37;
                        break;
                    case at.o /*3*/:
                        i4 = 55;
                        break;
                    default:
                        i4 = 6;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "_il{C]wbrH\\zlt";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new ot(z[1], 0);
                    FAILED_GENERIC = new ot(z[2], 1);
                    FAILED_OUT_OF_SPACE = new ot(z[0], 2);
                    a = new ot[]{SUCCESS, FAILED_GENERIC, FAILED_OUT_OF_SPACE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "J}ftCJ{";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
