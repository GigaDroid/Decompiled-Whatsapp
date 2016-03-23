package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum axj {
    ;
    
    public static final axj FAILED;
    public static final axj SUCCESS_CREATED;
    public static final axj SUCCESS_RESTORED;
    private static final axj[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "Vi\u001fk_Vo\u0003z_Vh\u0013z_A";
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
                        i4 = 5;
                        break;
                    case at.g /*1*/:
                        i4 = 60;
                        break;
                    case at.i /*2*/:
                        i4 = 92;
                        break;
                    case at.o /*3*/:
                        i4 = 40;
                        break;
                    default:
                        i4 = 26;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "C}\u0015d_A";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FAILED = new axj(z[2], 0);
                    SUCCESS_RESTORED = new axj(z[0], 1);
                    SUCCESS_CREATED = new axj(z[1], 2);
                    a = new axj[]{FAILED, SUCCESS_RESTORED, SUCCESS_CREATED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "Vi\u001fk_Vo\u0003kH@}\bm^";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
