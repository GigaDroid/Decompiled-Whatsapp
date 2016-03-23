package com.whatsapp;

import org.v;
import org.whispersystems.at;

enum zc {
    ;
    
    public static final zc DATA_REMAINING;
    public static final zc FINISHED;
    public static final zc MAC_REMAINING;
    private static final zc[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "0I\u0003g>&M\u001ag(:A\u0019a";
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
                        i4 = 116;
                        break;
                    case at.g /*1*/:
                        i4 = 8;
                        break;
                    case at.i /*2*/:
                        i4 = 87;
                        break;
                    case at.o /*3*/:
                        i4 = 38;
                        break;
                    default:
                        i4 = 97;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "2A\u0019o2<M\u0013";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    DATA_REMAINING = new zc(z[0], 0);
                    MAC_REMAINING = new zc(z[1], 1);
                    FINISHED = new zc(z[2], 2);
                    a = new zc[]{DATA_REMAINING, MAC_REMAINING, FINISHED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "9I\u0014y31E\u0016o/=F\u0010";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
