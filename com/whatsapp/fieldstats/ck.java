package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum ck {
    ;
    
    public static final ck DUPLICATE;
    public static final ck ERROR_REQUEST;
    public static final ck ERROR_UNKNOWN;
    public static final ck ERROR_UPLOAD;
    public static final ck OK;
    private static final ck[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[5];
        String str = "/E";
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
                        i4 = 96;
                        break;
                    case at.g /*1*/:
                        i4 = 14;
                        break;
                    case at.i /*2*/:
                        i4 = 56;
                        break;
                    case at.o /*3*/:
                        i4 = 36;
                        break;
                    default:
                        i4 = 98;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "%\\jk0?\\}u7%]l";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "%\\jk0?[vo,/Yv";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "%\\jk0?[hh-!J";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new ck(z[0], 0, 1);
                    DUPLICATE = new ck(z[1], 1, 3);
                    ERROR_UNKNOWN = new ck(z[3], 2, 2);
                    ERROR_REQUEST = new ck(z[2], 3, 4);
                    ERROR_UPLOAD = new ck(z[4], 4, 5);
                    b = new ck[]{OK, DUPLICATE, ERROR_UNKNOWN, ERROR_REQUEST, ERROR_UPLOAD};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "$[hh+#Ola";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private ck(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
