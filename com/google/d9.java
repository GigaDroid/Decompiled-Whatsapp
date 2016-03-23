package com.google;

import org.v;
import org.whispersystems.at;

final class d9 extends dV {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "m\u007f\u00077nl";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = 76;
                        break;
                    case at.i /*2*/:
                        i3 = 53;
                        break;
                    case at.o /*3*/:
                        i3 = 7;
                        break;
                    default:
                        i3 = 93;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "m\u007f\u00077ol";
                    obj = null;
            }
        }
    }

    protected void c(StringBuilder stringBuilder, int i) {
        if (i < 10000) {
            stringBuilder.append(z[1]);
            if (!dt.c) {
                return;
            }
        }
        stringBuilder.append(z[0]);
    }

    d9(d_ d_Var) {
        super(d_Var);
    }

    protected int a(int i) {
        if (i < 10000) {
            return i;
        }
        return i - 10000;
    }
}
