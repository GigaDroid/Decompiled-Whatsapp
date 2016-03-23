package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum aki {
    ;
    
    public static final aki CANCEL;
    public static final aki FAILED_BAD_MEDIA;
    public static final aki FAILED_FNF;
    public static final aki FAILED_GENERIC;
    public static final aki FAILED_INSUFFICIENT_SPACE;
    public static final aki FAILED_IO;
    public static final aki FAILED_NO_PERMISSIONS;
    public static final aki FAILED_OOM;
    public static final aki SUCCESS;
    private static final aki[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "D~K27F`M1?";
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
                        i4 = 2;
                        break;
                    case at.g /*1*/:
                        i4 = 63;
                        break;
                    case at.i /*2*/:
                        i4 = 2;
                        break;
                    case at.o /*3*/:
                        i4 = 126;
                        break;
                    default:
                        i4 = 114;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "D~K27F`E;<GmK=";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "QjA=7Ql";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "A~L=7N";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "D~K27F`@?6]rG:;C";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "D~K27F`D04";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "D~K27F`K1";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "D~K27F`L1-RzP3;QlK1<Q";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new aki(z[3], 0);
                    FAILED_GENERIC = new aki(z[2], 1);
                    FAILED_INSUFFICIENT_SPACE = new aki(z[1], 2);
                    FAILED_IO = new aki(z[7], 3);
                    FAILED_OOM = new aki(z[0], 4);
                    FAILED_BAD_MEDIA = new aki(z[5], 5);
                    FAILED_NO_PERMISSIONS = new aki(z[8], 6);
                    FAILED_FNF = new aki(z[6], 7);
                    CANCEL = new aki(z[4], 8);
                    a = new aki[]{SUCCESS, FAILED_GENERIC, FAILED_INSUFFICIENT_SPACE, FAILED_IO, FAILED_OOM, FAILED_BAD_MEDIA, FAILED_NO_PERMISSIONS, FAILED_FNF, CANCEL};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "D~K27F`K0!WyD71KzL*-QoC=7";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
