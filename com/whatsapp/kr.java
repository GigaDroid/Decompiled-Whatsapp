package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum kr {
    ;
    
    public static final kr CENTER_CROP;
    public static final kr FIT_CENTER;
    public static final kr FIT_HEIGHT;
    public static final kr FIT_WIDTH;
    private static final kr[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "%K\u0015\u0015e&K\u0006\u0002y";
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
                        i4 = 99;
                        break;
                    case at.g /*1*/:
                        i4 = 2;
                        break;
                    case at.i /*2*/:
                        i4 = 65;
                        break;
                    case at.o /*3*/:
                        i4 = 74;
                        break;
                    default:
                        i4 = 45;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "%K\u0015\u0015z*F\u0015\u0002";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "%K\u0015\u0015n&L\u0015\u000f\u007f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FIT_CENTER = new kr(z[3], 0);
                    FIT_WIDTH = new kr(z[2], 1);
                    FIT_HEIGHT = new kr(z[0], 2);
                    CENTER_CROP = new kr(z[1], 3);
                    a = new kr[]{FIT_CENTER, FIT_WIDTH, FIT_HEIGHT, CENTER_CROP};
                    return;
                default:
                    strArr2[i2] = str;
                    str = " G\u000f\u001eh1]\u0002\u0018b3";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
