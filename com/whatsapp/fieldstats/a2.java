package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum a2 {
    ;
    
    public static final a2 ERROR_FAILED;
    public static final a2 ERROR_PROVIDER;
    public static final a2 ERROR_REQUEST;
    public static final a2 SUCCESS;
    private static final a2[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[4];
        String str = "}q/_Xgq8A_}p)";
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
                        i4 = 56;
                        break;
                    case at.g /*1*/:
                        i4 = 35;
                        break;
                    case at.i /*2*/:
                        i4 = 125;
                        break;
                    case at.o /*3*/:
                        i4 = 16;
                        break;
                    default:
                        i4 = 10;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "}q/_Xgs/_\\qg8B";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "kv>SOkp";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new a2(z[3], 0, 1);
                    ERROR_PROVIDER = new a2(z[2], 1, 2);
                    ERROR_REQUEST = new a2(z[0], 2, 3);
                    ERROR_FAILED = new a2(z[1], 3, 4);
                    a = new a2[]{SUCCESS, ERROR_PROVIDER, ERROR_REQUEST, ERROR_FAILED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "}q/_Xge<YF}g";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private a2(int i) {
        this.b = i;
    }
}
