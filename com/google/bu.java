package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

enum bu {
    ;
    
    public static final bu ALPHA;
    public static final bu ALPHA_SHIFT;
    public static final bu LOWER;
    public static final bu MIXED;
    public static final bu PUNCT;
    public static final bu PUNCT_SHIFT;
    private static final bu[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "&\u0007\u0019[#";
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
                        i4 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i4 = 78;
                        break;
                    case at.i /*2*/:
                        i4 = 65;
                        break;
                    case at.o /*3*/:
                        i4 = 30;
                        break;
                    default:
                        i4 = arj.Theme_checkedTextViewStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "*\u0002\u0011V&4\u001d\tW!?";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "*\u0002\u0011V&";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = ";\u001b\u000f]3";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "'\u0001\u0016[5";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALPHA = new bu(z[3], 0);
                    LOWER = new bu(z[5], 1);
                    MIXED = new bu(z[0], 2);
                    PUNCT = new bu(z[4], 3);
                    ALPHA_SHIFT = new bu(z[2], 4);
                    PUNCT_SHIFT = new bu(z[1], 5);
                    a = new bu[]{ALPHA, LOWER, MIXED, PUNCT, ALPHA_SHIFT, PUNCT_SHIFT};
                    return;
                default:
                    strArr2[i2] = str;
                    str = ";\u001b\u000f]34\u001d\tW!?";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
