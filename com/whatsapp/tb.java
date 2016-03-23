package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum tb {
    ;
    
    public static final tb FIRST_INIT;
    public static final tb FROM_SAVED_STATE;
    public static final tb IN_BACKGROUND;
    public static final tb REQUIRES_INFLATE;
    private static final tb[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\u000b\u001f\u001a\u0001\u001c\u001e\f\u0003\t\u0007\u0012\u001e\u0001\r\u0017\b";
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
                        i4 = 77;
                        break;
                    case at.g /*1*/:
                        i4 = 77;
                        break;
                    case at.i /*2*/:
                        i4 = 85;
                        break;
                    case at.o /*3*/:
                        i4 = 76;
                        break;
                    default:
                        i4 = 67;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0004\u0003\n\u000e\u0002\u000e\u0006\u0012\u001e\f\u0018\u0003\u0011";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u000b\u0004\u0007\u001f\u0017\u0012\u0004\u001b\u0005\u0017";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    REQUIRES_INFLATE = new tb(z[1], 0);
                    IN_BACKGROUND = new tb(z[2], 1);
                    FIRST_INIT = new tb(z[3], 2);
                    FROM_SAVED_STATE = new tb(z[0], 3);
                    a = new tb[]{REQUIRES_INFLATE, IN_BACKGROUND, FIRST_INIT, FROM_SAVED_STATE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001f\b\u0004\u0019\n\u001f\b\u0006\u0013\n\u0003\u000b\u0019\r\u0017\b";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
