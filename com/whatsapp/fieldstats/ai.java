package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum ai {
    ;
    
    public static final ai MIXED;
    public static final ai P2P;
    public static final ai TCP_RELAY;
    public static final ai UDP_RELAY;
    private static final ai[] b;
    private static final String[] z;
    private final int a;

    private ai(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[4];
        String str = "b\u001c\b";
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
                        i4 = 50;
                        break;
                    case at.g /*1*/:
                        i4 = 46;
                        break;
                    case at.i /*2*/:
                        i4 = 88;
                        break;
                    case at.o /*3*/:
                        i4 = 1;
                        break;
                    default:
                        i4 = 10;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "gj\b^Xwb\u0019X";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u007fg\u0000DN";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    P2P = new ai(z[0], 0, 1);
                    UDP_RELAY = new ai(z[2], 1, 2);
                    TCP_RELAY = new ai(z[1], 2, 3);
                    MIXED = new ai(z[3], 3, 4);
                    b = new ai[]{P2P, UDP_RELAY, TCP_RELAY, MIXED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "fm\b^Xwb\u0019X";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
