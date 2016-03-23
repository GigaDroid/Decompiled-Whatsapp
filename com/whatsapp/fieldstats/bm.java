package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bm {
    ;
    
    public static final bm ERROR_MAX_RETRY;
    public static final bm ERROR_UNKNOWN;
    public static final bm OK;
    public static final bm OK_AFTER_RETRY;
    private static final bm[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[4];
        String str = "~@\u001bksd_\b|~iW\u001dvx";
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
                        i4 = 59;
                        break;
                    case at.g /*1*/:
                        i4 = 18;
                        break;
                    case at.i /*2*/:
                        i4 = 73;
                        break;
                    case at.o /*3*/:
                        i4 = 36;
                        break;
                    default:
                        i4 = 33;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "~@\u001bksdG\u0007ootE\u0007";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "tY\u0016egoW\u001b{s~F\u001b}";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new bm(z[1], 0, 1);
                    OK_AFTER_RETRY = new bm(z[3], 1, 2);
                    ERROR_UNKNOWN = new bm(z[2], 2, 3);
                    ERROR_MAX_RETRY = new bm(z[0], 3, 4);
                    b = new bm[]{OK, OK_AFTER_RETRY, ERROR_UNKNOWN, ERROR_MAX_RETRY};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "tY";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private bm(int i) {
        this.a = i;
    }
}
