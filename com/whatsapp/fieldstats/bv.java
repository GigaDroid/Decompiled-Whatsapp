package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bv {
    ;
    
    public static final bv CALLEE;
    public static final bv CALLER;
    private static final bv[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[2];
        String str = "\u001f\u001c\u0006z;\u000e";
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
                        i4 = 92;
                        break;
                    case at.g /*1*/:
                        i4 = 93;
                        break;
                    case at.i /*2*/:
                        i4 = 74;
                        break;
                    case at.o /*3*/:
                        i4 = 54;
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
                    z = strArr3;
                    CALLER = new bv(z[0], 0, 1);
                    CALLEE = new bv(z[1], 1, 2);
                    a = new bv[]{CALLER, CALLEE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001f\u001c\u0006z;\u0019";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    private bv(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }
}
