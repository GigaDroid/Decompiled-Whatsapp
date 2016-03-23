package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum b2 {
    ;
    
    public static final b2 CORRUPT;
    public static final b2 MANUAL;
    public static final b2 RESUME;
    private static final b2[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[3];
        String str = "\u0019gt#Q\u000e";
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
                        i4 = 75;
                        break;
                    case at.g /*1*/:
                        i4 = 34;
                        break;
                    case at.i /*2*/:
                        i4 = 39;
                        break;
                    case at.o /*3*/:
                        i4 = 118;
                        break;
                    default:
                        i4 = 28;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0006ci#]\u0007";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    MANUAL = new b2(z[2], 0, 1);
                    RESUME = new b2(z[0], 1, 2);
                    CORRUPT = new b2(z[1], 2, 3);
                    a = new b2[]{MANUAL, RESUME, CORRUPT};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\bmu$I\u001bv";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private b2(int i) {
        this.b = i;
    }
}
