package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum a5a {
    ;
    
    public static final a5a COUNT;
    public static final a5a COUNT_2;
    public static final a5a COUNT_3;
    public static final a5a POSITION;
    private static final a5a[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\u0005!\u0015a#\u001c!\b";
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
                        i4 = 85;
                        break;
                    case at.g /*1*/:
                        i4 = 110;
                        break;
                    case at.i /*2*/:
                        i4 = 70;
                        break;
                    case at.o /*3*/:
                        i4 = 40;
                        break;
                    default:
                        i4 = 119;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0016!\u0013f#\n\\";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0016!\u0013f#\n]";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    POSITION = new a5a(z[0], 0);
                    COUNT = new a5a(z[1], 1);
                    COUNT_2 = new a5a(z[2], 2);
                    COUNT_3 = new a5a(z[3], 3);
                    a = new a5a[]{POSITION, COUNT, COUNT_2, COUNT_3};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0016!\u0013f#";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
