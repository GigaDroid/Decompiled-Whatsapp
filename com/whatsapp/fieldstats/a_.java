package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum a_ {
    ;
    
    public static final a_ CANCELLED;
    public static final a_ SENT;
    public static final a_ TOO_SHORT;
    private static final a_[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[3];
        String str = "\u000b\u00190>\u0002\u0004\u0014;9";
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
                        i4 = 72;
                        break;
                    case at.g /*1*/:
                        i4 = 88;
                        break;
                    case at.i /*2*/:
                        i4 = 126;
                        break;
                    case at.o /*3*/:
                        i4 = 125;
                        break;
                    default:
                        i4 = 71;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u001c\u00171\"\u0014\u0000\u0017,)";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SENT = new a_(z[1], 0, 1);
                    CANCELLED = new a_(z[0], 1, 2);
                    TOO_SHORT = new a_(z[2], 2, 3);
                    b = new a_[]{SENT, CANCELLED, TOO_SHORT};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001b\u001d0)";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private a_(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
