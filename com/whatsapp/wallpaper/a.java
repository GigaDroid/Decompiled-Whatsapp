package com.whatsapp.wallpaper;

import org.v;
import org.whispersystems.at;

enum a {
    ;
    
    public static final a Grow;
    public static final a Move;
    public static final a None;
    private static final a[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "U<Rd";
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
                        i4 = 24;
                        break;
                    case at.g /*1*/:
                        i4 = 83;
                        break;
                    case at.i /*2*/:
                        i4 = 36;
                        break;
                    case at.o /*3*/:
                        i4 = 1;
                        break;
                    default:
                        i4 = 73;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "V<Jd";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    None = new a(z[2], 0);
                    Move = new a(z[0], 1);
                    Grow = new a(z[1], 2);
                    a = new a[]{None, Move, Grow};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "_!Kv";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
