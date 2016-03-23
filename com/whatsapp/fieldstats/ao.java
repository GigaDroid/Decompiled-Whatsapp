package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum ao {
    ;
    
    public static final ao BUILTIN;
    public static final ao NONE;
    public static final ao SOFTWARE;
    private static final ao[] a;
    private static final String[] z;
    private final int b;

    private ao(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "WWQ\u0019\u0003EJR";
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
                        i4 = 4;
                        break;
                    case at.g /*1*/:
                        i4 = 24;
                        break;
                    case at.i /*2*/:
                        i4 = 23;
                        break;
                    case at.o /*3*/:
                        i4 = 77;
                        break;
                    default:
                        i4 = 84;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "FM^\u0001\u0000MV";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new ao(z[1], 0, 1);
                    SOFTWARE = new ao(z[0], 1, 2);
                    BUILTIN = new ao(z[2], 2, 3);
                    a = new ao[]{NONE, SOFTWARE, BUILTIN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "JWY\b";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }
}
