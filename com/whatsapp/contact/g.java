package com.whatsapp.contact;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum g {
    ;
    
    public static final g CHUNKED;
    public static final g DELTA;
    public static final g FULL;
    public static final g QUERY;
    private static final String[] z;
    private final String a;

    private g(String str) {
        this.a = str;
    }

    public String getModeString() {
        return this.a;
    }

    static {
        String[] strArr = new String[8];
        String str = "Eo\u007f\u00169";
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
                        i4 = 1;
                        break;
                    case at.g /*1*/:
                        i4 = 42;
                        break;
                    case at.i /*2*/:
                        i4 = 51;
                        break;
                    case at.o /*3*/:
                        i4 = 66;
                        break;
                    default:
                        i4 = 120;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "G\u007f\u007f\u000e";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "p_V0\u0001";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "g__.";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "P\u007fv\u0010!";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "bBF,\u0013dN";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "eO_6\u0019";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FULL = new g(z[2], 0, z[4]);
                    DELTA = new g(z[0], 1, z[7]);
                    QUERY = new g(z[5], 2, z[3]);
                    CHUNKED = new g(z[1], 3, z[6]);
                    b = new g[]{FULL, DELTA, QUERY, CHUNKED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "Bbf\f3Dn";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
