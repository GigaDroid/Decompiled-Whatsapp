package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum a9 {
    ;
    
    public static final a9 EMAIL;
    public static final a9 SELF;
    public static final a9 SMS;
    public static final a9 VOICE;
    private static final a9[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[4];
        String str = "\u0007\u000b\u001fD\t";
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
                        i4 = 66;
                        break;
                    case at.g /*1*/:
                        i4 = 70;
                        break;
                    case at.i /*2*/:
                        i4 = 94;
                        break;
                    case at.o /*3*/:
                        i4 = 13;
                        break;
                    default:
                        i4 = 69;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0011\u000b\r";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0014\t\u0017N\u0000";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SMS = new a9(z[2], 0, 1);
                    VOICE = new a9(z[3], 1, 2);
                    EMAIL = new a9(z[0], 2, 3);
                    SELF = new a9(z[1], 3, 4);
                    b = new a9[]{SMS, VOICE, EMAIL, SELF};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0011\u0003\u0012K";
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

    private a9(int i) {
        this.a = i;
    }
}
