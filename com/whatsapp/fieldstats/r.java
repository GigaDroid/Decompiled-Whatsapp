package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum r {
    ;
    
    public static final r ERROR_UNKNOWN;
    public static final r OK;
    @Deprecated
    public static final r OK_AFTER_RETRY;
    private static final r[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[3];
        String str = "YlDK\u0002CkXO\u001eSiX";
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
                        i4 = 28;
                        break;
                    case at.g /*1*/:
                        i4 = 62;
                        break;
                    case at.i /*2*/:
                        i4 = 22;
                        break;
                    case at.o /*3*/:
                        i4 = 4;
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
                    str = "Su";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new r(z[2], 0, 1);
                    OK_AFTER_RETRY = new r(z[1], 1, 2);
                    ERROR_UNKNOWN = new r(z[0], 2, 3);
                    b = new r[]{OK, OK_AFTER_RETRY, ERROR_UNKNOWN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "SuIE\u0016H{D[\u0002YjD]";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private r(int i) {
        this.a = i;
    }
}
