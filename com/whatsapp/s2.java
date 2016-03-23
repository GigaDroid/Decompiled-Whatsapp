package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum s2 {
    ;
    
    public static final s2 BLOCKED;
    public static final s2 ERROR_BAD_TOKEN;
    public static final s2 FORMAT_WRONG;
    public static final s2 INCORRECT;
    public static final s2 LENGTH_LONG;
    public static final s2 LENGTH_SHORT;
    public static final s2 OLD_VERSION;
    public static final s2 TEMPORARILY_UNAVAILABLE;
    private static final s2[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "S0*3\u0004W*(;\u001eX";
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
                        i4 = 31;
                        break;
                    case at.g /*1*/:
                        i4 = 117;
                        break;
                    case at.i /*2*/:
                        i4 = 100;
                        break;
                    case at.o /*3*/:
                        i4 = 116;
                        break;
                    default:
                        i4 = 80;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "V;';\u0002M0' ";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "K0)$\u001fM46=\u001cF*1:\u0011I4-8\u0011]9!";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "Y:69\u0011K*3&\u001fQ2";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "P9 +\u0006Z'7=\u001fQ";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "Z'6;\u0002@7%0\u000fK:/1\u001e";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "]9+7\u001bZ1";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    INCORRECT = new s2(z[2], 0);
                    BLOCKED = new s2(z[7], 1);
                    LENGTH_LONG = new s2(z[0], 2);
                    LENGTH_SHORT = new s2(z[1], 3);
                    FORMAT_WRONG = new s2(z[4], 4);
                    TEMPORARILY_UNAVAILABLE = new s2(z[3], 5);
                    OLD_VERSION = new s2(z[5], 6);
                    ERROR_BAD_TOKEN = new s2(z[6], 7);
                    a = new s2[]{INCORRECT, BLOCKED, LENGTH_LONG, LENGTH_SHORT, FORMAT_WRONG, TEMPORARILY_UNAVAILABLE, OLD_VERSION, ERROR_BAD_TOKEN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "S0*3\u0004W*7<\u001fM!";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
