package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum as {
    ;
    
    public static final as AUTO_DETECTED;
    public static final as RETRIED;
    public static final as TAPPED_LINK;
    public static final as TYPED;
    private static final as[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "N\u00196:-Y\u0018";
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
                        i4 = 28;
                        break;
                    case at.g /*1*/:
                        i4 = 92;
                        break;
                    case at.i /*2*/:
                        i4 = 98;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_editTextStyle;
                        break;
                    default:
                        i4 = 100;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "H\u00052- ";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "H\u001d28!X\u0003.!*W";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    TYPED = new as(z[2], 0);
                    AUTO_DETECTED = new as(z[1], 1);
                    TAPPED_LINK = new as(z[3], 2);
                    RETRIED = new as(z[0], 3);
                    a = new as[]{TYPED, AUTO_DETECTED, TAPPED_LINK, RETRIED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "]\t6';X\u00196-'H\u0019&";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
