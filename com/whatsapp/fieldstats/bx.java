package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bx {
    ;
    
    public static final bx BACK_FORWARD;
    public static final bx NAVIGATE_NEXT;
    public static final bx RELOAD;
    public static final bx UNDEFINED;
    private static final bx[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    private bx(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[4];
        String str = " \u001fF\u0006;6";
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
                        i4 = 114;
                        break;
                    case at.g /*1*/:
                        i4 = 90;
                        break;
                    case at.i /*2*/:
                        i4 = 10;
                        break;
                    case at.o /*3*/:
                        i4 = 73;
                        break;
                    default:
                        i4 = 122;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "'\u0014N\f<;\u0014O\r";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "<\u001b\\\u0000=3\u000eO\u001647\u0002^";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NAVIGATE_NEXT = new bx(z[3], 0, 0);
                    RELOAD = new bx(z[0], 1, 1);
                    BACK_FORWARD = new bx(z[1], 2, 2);
                    UNDEFINED = new bx(z[2], 3, 255);
                    a = new bx[]{NAVIGATE_NEXT, RELOAD, BACK_FORWARD, UNDEFINED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "0\u001bI\u0002%4\u0015X\u001e; \u001e";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
