package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum c9 {
    ;
    
    public static final c9 NONE;
    public static final c9 V2;
    private static final c9[] a;
    private static final String[] z;
    private final int b;

    private c9(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[2];
        String str = "dm";
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
                        i4 = 50;
                        break;
                    case at.g /*1*/:
                        i4 = 95;
                        break;
                    case at.i /*2*/:
                        i4 = 79;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                    default:
                        i4 = 122;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new c9(z[1], 0, 0);
                    V2 = new c9(z[0], 1, 2);
                    a = new c9[]{NONE, V2};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "|\u0010\u0001)";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }
}
