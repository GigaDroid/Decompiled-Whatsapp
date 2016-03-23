package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bc {
    ;
    
    public static final bc WIFI_ONLY;
    public static final bc WIFI_OR_CELLULAR;
    private static final bc[] b;
    private static final String[] z;
    private final int a;

    private bc(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[2];
        String str = "CxCgU[\u007fIw";
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
                        i4 = 20;
                        break;
                    case at.g /*1*/:
                        i4 = 49;
                        break;
                    case at.i /*2*/:
                        i4 = 5;
                        break;
                    case at.o /*3*/:
                        i4 = 46;
                        break;
                    default:
                        i4 = 10;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    WIFI_ONLY = new bc(z[0], 0, 0);
                    WIFI_OR_CELLULAR = new bc(z[1], 1, 1);
                    b = new bc[]{WIFI_ONLY, WIFI_OR_CELLULAR};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "CxCgU[cZmOX}PbKF";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }
}
