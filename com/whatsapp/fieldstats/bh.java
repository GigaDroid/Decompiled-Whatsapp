package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bh {
    ;
    
    public static final bh ERROR_UNKNOWN;
    public static final bh OK;
    private static final bh[] a;
    private static final String[] z;
    private final int b;

    private bh(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[2];
        String str = "\u001f:";
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
                        i4 = 80;
                        break;
                    case at.g /*1*/:
                        i4 = 113;
                        break;
                    case at.i /*2*/:
                        i4 = 48;
                        break;
                    case at.o /*3*/:
                        i4 = 112;
                        break;
                    default:
                        i4 = 100;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new bh(z[0], 0, 1);
                    ERROR_UNKNOWN = new bh(z[1], 1, 2);
                    a = new bh[]{OK, ERROR_UNKNOWN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0015#b?6\u000f$~;*\u001f&~";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }
}
