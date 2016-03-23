package com.google;

import org.v;
import org.whispersystems.at;

enum b9 {
    ;
    
    public static final b9 ALPHA;
    public static final b9 ISO_IEC_646;
    public static final b9 NUMERIC;
    private static final b9[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "~\u0000oB\u0005";
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
                        i4 = 63;
                        break;
                    case at.g /*1*/:
                        i4 = 76;
                        break;
                    case at.i /*2*/:
                        i4 = 63;
                        break;
                    case at.o /*3*/:
                        i4 = 10;
                        break;
                    default:
                        i4 = 68;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "v\u001fpU\rz\u000f`<p\t";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NUMERIC = new b9(z[1], 0);
                    ALPHA = new b9(z[0], 1);
                    ISO_IEC_646 = new b9(z[2], 2);
                    a = new b9[]{NUMERIC, ALPHA, ISO_IEC_646};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "q\u0019rO\u0016v\u000f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
