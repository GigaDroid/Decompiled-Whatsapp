package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum b0 {
    ;
    
    public static final b0 SUPPORTED;
    public static final b0 UNSUPPORTED_BAD_DEVICE;
    public static final b0 UNSUPPORTED_NO_ENCODERS;
    public static final b0 UNSUPPORTED_OLD_API;
    private static final b0[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    private b0(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[4];
        String str = "\u0011\u001b\u0011BW\u0014\u001a\u0010CB\u0000\n\fXX\u0001\u001b\u0001XC\u0001\u0007\u0011";
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
                        i4 = 68;
                        break;
                    case at.g /*1*/:
                        i4 = 85;
                        break;
                    case at.i /*2*/:
                        i4 = 66;
                        break;
                    case at.o /*3*/:
                        i4 = 23;
                        break;
                    default:
                        i4 = 7;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0011\u001b\u0011BW\u0014\u001a\u0010CB\u0000\n\r[C\u001b\u0014\u0012^";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0011\u001b\u0011BW\u0014\u001a\u0010CB\u0000\n\u0000VC\u001b\u0011\u0007AN\u0007\u0010";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUPPORTED = new b0(z[1], 0, 0);
                    UNSUPPORTED_OLD_API = new b0(z[2], 1, 1);
                    UNSUPPORTED_BAD_DEVICE = new b0(z[3], 2, 2);
                    UNSUPPORTED_NO_ENCODERS = new b0(z[0], 3, 3);
                    a = new b0[]{SUPPORTED, UNSUPPORTED_OLD_API, UNSUPPORTED_BAD_DEVICE, UNSUPPORTED_NO_ENCODERS};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0017\u0000\u0012GH\u0016\u0001\u0007S";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
