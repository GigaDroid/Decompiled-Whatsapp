package com.whatsapp;

import org.v;
import org.whispersystems.at;

enum ao1 {
    ;
    
    public static final ao1 INCOMING;
    public static final ao1 MISSED;
    public static final ao1 OUTGOING;
    public static final ao1 UNKNOWN;
    private static final ao1[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "[\fT\u0002+[\fP";
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
                        i4 = 18;
                        break;
                    case at.g /*1*/:
                        i4 = 66;
                        break;
                    case at.i /*2*/:
                        i4 = 23;
                        break;
                    case at.o /*3*/:
                        i4 = 77;
                        break;
                    default:
                        i4 = arj.Theme_checkboxStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "_\u000bD\u001e#V";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "]\u0017C\n)[\fP";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OUTGOING = new ao1(z[3], 0);
                    INCOMING = new ao1(z[0], 1);
                    MISSED = new ao1(z[2], 2);
                    UNKNOWN = new ao1(z[1], 3);
                    a = new ao1[]{OUTGOING, INCOMING, MISSED, UNKNOWN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "G\f\\\u0003)E\f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
