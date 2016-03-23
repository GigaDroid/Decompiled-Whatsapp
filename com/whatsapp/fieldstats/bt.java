package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bt {
    ;
    
    public static final bt BB_ALTERNATE_APN;
    public static final bt BB_BES;
    public static final bt BB_BIS;
    public static final bt DIRECT;
    public static final bt WAP;
    private static final bt[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[5];
        String str = "\u001cOx\u0010v\f";
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
                        i4 = 88;
                        break;
                    case at.g /*1*/:
                        i4 = 6;
                        break;
                    case at.i /*2*/:
                        i4 = 42;
                        break;
                    case at.o /*3*/:
                        i4 = 85;
                        break;
                    default:
                        i4 = 53;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u001aDu\u0017|\u000b";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u000fGz";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u001aDu\u0017p\u000b";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    DIRECT = new bt(z[0], 0, 0);
                    WAP = new bt(z[3], 1, 1);
                    BB_BIS = new bt(z[2], 2, 2);
                    BB_BES = new bt(z[4], 3, 3);
                    BB_ALTERNATE_APN = new bt(z[1], 4, 4);
                    a = new bt[]{DIRECT, WAP, BB_BIS, BB_BES, BB_ALTERNATE_APN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001aDu\u0014y\fCx\u001bt\fCu\u0014e\u0016";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private bt(int i) {
        this.b = i;
    }
}
