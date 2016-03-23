package com.whatsapp.util;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum z {
    ;
    
    public static final z CRYPT1;
    public static final z CRYPT2;
    public static final z CRYPT3;
    public static final z CRYPT4;
    public static final z CRYPT5;
    public static final z CRYPT6;
    public static final z CRYPT7;
    public static final z CRYPT8;
    public static final z CRYPT9;
    private static final z[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "i$e|*\u001f";
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
                        i4 = 42;
                        break;
                    case at.g /*1*/:
                        i4 = 118;
                        break;
                    case at.i /*2*/:
                        i4 = 60;
                        break;
                    case at.o /*3*/:
                        i4 = 44;
                        break;
                    default:
                        i4 = 126;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "i$e|*\u0019";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "i$e|*\u001b";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "i$e|*\u0018";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "i$e|*\u001c";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "i$e|*\u0013";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "i$e|*\u001d";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "i$e|*\u0012";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CRYPT1 = new z(z[3], 0);
                    CRYPT2 = new z(z[4], 1);
                    CRYPT3 = new z(z[2], 2);
                    CRYPT4 = new z(z[1], 3);
                    CRYPT5 = new z(z[0], 4);
                    CRYPT6 = new z(z[5], 5);
                    CRYPT7 = new z(z[7], 6);
                    CRYPT8 = new z(z[8], 7);
                    CRYPT9 = new z(z[6], 8);
                    a = new z[]{CRYPT1, CRYPT2, CRYPT3, CRYPT4, CRYPT5, CRYPT6, CRYPT7, CRYPT8, CRYPT9};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "i$e|*\u001e";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
