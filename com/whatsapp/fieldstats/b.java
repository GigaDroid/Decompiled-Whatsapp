package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum b {
    ;
    
    public static final b CELLULAR;
    public static final b NONE;
    public static final b WIFI;
    private static final b[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[3];
        String str = "\u001d\fO*";
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
                        i4 = 74;
                        break;
                    case at.g /*1*/:
                        i4 = 69;
                        break;
                    case at.i /*2*/:
                        i4 = 9;
                        break;
                    case at.o /*3*/:
                        i4 = 99;
                        break;
                    default:
                        i4 = 96;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0004\nG&";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CELLULAR = new b(z[1], 0, 1);
                    WIFI = new b(z[0], 1, 2);
                    NONE = new b(z[2], 2, 3);
                    b = new b[]{CELLULAR, WIFI, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\t\u0000E/5\u0006\u0004[";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }

    private b(int i) {
        this.a = i;
    }
}
