package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bu {
    ;
    
    public static final bu BUILTIN;
    public static final bu NONE;
    public static final bu SOFTWARE;
    private static final bu[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private bu(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "\u0001\u001f;Dn\u0013\u00028";
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
                        i4 = 82;
                        break;
                    case at.g /*1*/:
                        i4 = 80;
                        break;
                    case at.i /*2*/:
                        i4 = 125;
                        break;
                    case at.o /*3*/:
                        i4 = 16;
                        break;
                    default:
                        i4 = 57;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0010\u00054\\m\u001b\u001e";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new bu(z[1], 0, 1);
                    SOFTWARE = new bu(z[0], 1, 2);
                    BUILTIN = new bu(z[2], 2, 3);
                    b = new bu[]{NONE, SOFTWARE, BUILTIN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001c\u001f3U";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
