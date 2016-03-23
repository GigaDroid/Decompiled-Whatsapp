package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum ns {
    ;
    
    public static final ns SUPPORTED;
    public static final ns UNSUPPORTED_BAD_DEVICE;
    public static final ns UNSUPPORTED_NO_ENCODER;
    public static final ns UNSUPPORTED_OLD_API;
    private static final ns[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "(\u0010\u001c\u007f\u0018-\u0011\u001d~\r9\u0001\u0000f\f\"\u001f\u001fc";
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
                        i4 = 125;
                        break;
                    case at.g /*1*/:
                        i4 = 94;
                        break;
                    case at.i /*2*/:
                        i4 = 79;
                        break;
                    case at.o /*3*/:
                        i4 = 42;
                        break;
                    default:
                        i4 = 72;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = ".\u000b\u001fz\u0007/\n\nn";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "(\u0010\u001c\u007f\u0018-\u0011\u001d~\r9\u0001\u0001e\u00178\u0010\fe\f8\f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUPPORTED = new ns(z[2], 0);
                    UNSUPPORTED_OLD_API = new ns(z[0], 1);
                    UNSUPPORTED_BAD_DEVICE = new ns(z[1], 2);
                    UNSUPPORTED_NO_ENCODER = new ns(z[3], 3);
                    a = new ns[]{SUPPORTED, UNSUPPORTED_OLD_API, UNSUPPORTED_BAD_DEVICE, UNSUPPORTED_NO_ENCODER};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "(\u0010\u001c\u007f\u0018-\u0011\u001d~\r9\u0001\rk\f\"\u001a\n|\u0001>\u001b";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
