package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum dq {
    ;
    
    public static final dq CREATED;
    public static final dq FAIL;
    public static final dq OK;
    private static final dq[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "qY";
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
                        i4 = 62;
                        break;
                    case at.g /*1*/:
                        i4 = 18;
                        break;
                    case at.i /*2*/:
                        i4 = 1;
                        break;
                    case at.o /*3*/:
                        i4 = 81;
                        break;
                    default:
                        i4 = 93;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "}@D\u0010\t{V";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new dq(z[0], 0);
                    FAIL = new dq(z[1], 1);
                    CREATED = new dq(z[2], 2);
                    a = new dq[]{OK, FAIL, CREATED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "xSH\u001d";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
