package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum ca {
    ;
    
    public static final ca BKG_FETCH;
    public static final ca BKG_NOTIFICATION;
    public static final ca UNKNOWN;
    public static final ca USER;
    private static final ca[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[4];
        String str = "\b\u0019\u0017G?\u0005\u0006\u0019^8\t\u0013\u0004Q>\u0004";
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
                        i4 = 82;
                        break;
                    case at.i /*2*/:
                        i4 = 80;
                        break;
                    case at.o /*3*/:
                        i4 = 24;
                        break;
                    default:
                        i4 = 113;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\b\u0019\u0017G7\u000f\u0006\u0013P";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u001f\u001c\u001bV>\u001d\u001c";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    USER = new ca(z[1], 0, 1);
                    BKG_NOTIFICATION = new ca(z[0], 1, 2);
                    BKG_FETCH = new ca(z[2], 2, 3);
                    UNKNOWN = new ca(z[3], 3, 4);
                    a = new ca[]{USER, BKG_NOTIFICATION, BKG_FETCH, UNKNOWN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001f\u0001\u0015J";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private ca(int i) {
        this.b = i;
    }
}
