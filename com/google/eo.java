package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

enum eo {
    ;
    
    public static final eo DONE;
    public static final eo NOT_READY;
    public static final eo READY;
    private static final eo[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = ";vL-";
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
                        i4 = 127;
                        break;
                    case at.g /*1*/:
                        i4 = 57;
                        break;
                    case at.i /*2*/:
                        i4 = 2;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_editTextStyle;
                        break;
                    default:
                        i4 = 94;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "-|C,\u0007";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NOT_READY = new eo(z[1], 0);
                    READY = new eo(z[2], 1);
                    DONE = new eo(z[0], 2);
                    a = new eo[]{NOT_READY, READY, DONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "1vV7\f:xF1";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
