package com.whatsapp;

import org.v;
import org.whispersystems.at;

enum u7 {
    ;
    
    public static final u7 BROADCAST;
    public static final u7 CALL;
    public static final u7 NORMAL;
    private static final u7[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "v\u0002px";
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
                        i4 = 53;
                        break;
                    case at.g /*1*/:
                        i4 = 67;
                        break;
                    case at.i /*2*/:
                        i4 = 60;
                        break;
                    case at.o /*3*/:
                        i4 = 52;
                        break;
                    default:
                        i4 = 111;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "{\fny.y";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NORMAL = new u7(z[2], 0);
                    BROADCAST = new u7(z[1], 1);
                    CALL = new u7(z[0], 2);
                    a = new u7[]{NORMAL, BROADCAST, CALL};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "w\u0011su+v\u0002o`";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
