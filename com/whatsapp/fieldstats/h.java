package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum h {
    ;
    
    public static final h BINDED;
    public static final h UNBOUND;
    private static final h[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[2];
        String str = "b\u001dx!dy\u0017";
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
                        i4 = 55;
                        break;
                    case at.g /*1*/:
                        i4 = 83;
                        break;
                    case at.i /*2*/:
                        i4 = 58;
                        break;
                    case at.o /*3*/:
                        i4 = 110;
                        break;
                    default:
                        i4 = 49;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    UNBOUND = new h(z[0], 0, 1);
                    BINDED = new h(z[1], 1, 2);
                    b = new h[]{UNBOUND, BINDED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "u\u001at*ts";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    public int getCode() {
        return this.a;
    }

    private h(int i) {
        this.a = i;
    }
}
