package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum ad {
    ;
    
    public static final ad GROUP;
    public static final ad INDIVIDUAL;
    public static final ad LIST;
    private static final ad[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[3];
        String str = "Ko F6";
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
                        i4 = 12;
                        break;
                    case at.g /*1*/:
                        i4 = 61;
                        break;
                    case at.i /*2*/:
                        i4 = 111;
                        break;
                    case at.o /*3*/:
                        i4 = 19;
                        break;
                    default:
                        i4 = arj.Theme_checkboxStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "Es+Z0Ey:R*";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    INDIVIDUAL = new ad(z[2], 0, 0);
                    GROUP = new ad(z[0], 1, 1);
                    LIST = new ad(z[1], 2, 2);
                    b = new ad[]{INDIVIDUAL, GROUP, LIST};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "@t<G";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private ad(int i) {
        this.a = i;
    }
}
