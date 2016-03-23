package com.whatsapp.contact;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum h {
    ;
    
    public static final h BACKGROUND;
    public static final h INTERACTIVE;
    public static final h NOTIFICATION;
    public static final h REGISTRATION;
    private static final String[] z;
    private final String b;

    private h(String str) {
        this.b = str;
    }

    public String getContextString() {
        return this.b;
    }

    static {
        String[] strArr = new String[8];
        String str = "YF~=M_Qx WDM";
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
                        i4 = 43;
                        break;
                    case at.g /*1*/:
                        i4 = 35;
                        break;
                    case at.i /*2*/:
                        i4 = 25;
                        break;
                    case at.o /*3*/:
                        i4 = 84;
                        break;
                    default:
                        i4 = 62;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "elM\u001dxb`X\u0000wdm";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "yf^\u001dm\u007fqX\u0000wdm";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "bmM\u0011lj`M\u001dhn";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "ELm=XB@x WDM";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "ibZ\u001fyylL\u001az";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "IBz?YYLl:Z";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    REGISTRATION = new h(z[3], 0, z[0]);
                    INTERACTIVE = new h(z[4], 1, z[1]);
                    BACKGROUND = new h(z[6], 2, z[7]);
                    NOTIFICATION = new h(z[2], 3, z[5]);
                    a = new h[]{REGISTRATION, INTERACTIVE, BACKGROUND, NOTIFICATION};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "BMm1LJ@m=HN";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
