package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum t {
    ;
    
    public static final t DAILY;
    public static final t MANUAL;
    public static final t MONTHLY;
    public static final t OFF;
    public static final t WEEKLY;
    private static final t[] b;
    private static final String[] z;
    private final int a;

    private t(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[5];
        String str = "~4Cgtp";
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
                        i4 = 41;
                        break;
                    case at.g /*1*/:
                        i4 = 113;
                        break;
                    case at.i /*2*/:
                        i4 = 6;
                        break;
                    case at.o /*3*/:
                        i4 = 44;
                        break;
                    default:
                        i4 = 56;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "m0O`a";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "d0Hyye";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "d>Hxpe(";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OFF = new t(z[1], 0, 0);
                    DAILY = new t(z[2], 1, 1);
                    WEEKLY = new t(z[0], 2, 2);
                    MONTHLY = new t(z[4], 3, 3);
                    MANUAL = new t(z[3], 4, 4);
                    b = new t[]{OFF, DAILY, WEEKLY, MONTHLY, MANUAL};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "f7@";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
