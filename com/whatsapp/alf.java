package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum alf {
    ;
    
    public static final alf BOTH;
    public static final alf LEFT;
    public static final alf NONE;
    public static final alf RIGHT;
    private static final alf[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\u001b+v\u0014";
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
                        i4 = 87;
                        break;
                    case at.g /*1*/:
                        i4 = 110;
                        break;
                    case at.i /*2*/:
                        i4 = 48;
                        break;
                    case at.o /*3*/:
                        i4 = 64;
                        break;
                    default:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0005'w\b8";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0015!d\b";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new alf(z[1], 0);
                    LEFT = new alf(z[0], 1);
                    RIGHT = new alf(z[2], 2);
                    BOTH = new alf(z[3], 3);
                    a = new alf[]{NONE, LEFT, RIGHT, BOTH};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0019!~\u0005";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
