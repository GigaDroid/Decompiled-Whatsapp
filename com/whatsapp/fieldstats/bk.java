package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bk {
    ;
    
    public static final bk ENDED_BY_PEER;
    public static final bk ENDED_BY_SELF;
    public static final bk ENDED_BY_USER;
    public static final bk RECONNECTING;
    public static final bk TIMEOUT;
    private static final bk[] b;
    private static final String[] z;
    private final int a;

    private bk(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[5];
        String str = "x\r5Q3y\u0010";
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
                        i4 = 44;
                        break;
                    case at.g /*1*/:
                        i4 = 68;
                        break;
                    case at.i /*2*/:
                        i4 = 120;
                        break;
                    case at.o /*3*/:
                        i4 = 20;
                        break;
                    default:
                        i4 = 124;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "i\n<Q8s\u0006!K/i\b>";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "~\u0001;[2b\u0001;@5b\u0003";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "i\n<Q8s\u0006!K)\u007f\u0001*";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ENDED_BY_USER = new bk(z[4], 0, 1);
                    TIMEOUT = new bk(z[0], 1, 2);
                    RECONNECTING = new bk(z[3], 2, 3);
                    ENDED_BY_SELF = new bk(z[2], 3, 4);
                    ENDED_BY_PEER = new bk(z[1], 4, 5);
                    b = new bk[]{ENDED_BY_USER, TIMEOUT, RECONNECTING, ENDED_BY_SELF, ENDED_BY_PEER};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "i\n<Q8s\u0006!K,i\u0001*";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
