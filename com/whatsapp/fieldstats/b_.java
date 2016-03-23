package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum b_ {
    ;
    
    public static final b_ BUILTIN;
    public static final b_ NONE;
    public static final b_ SOFTWARE;
    private static final b_[] a;
    private static final String[] z;
    private final int b;

    private b_(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[3];
        String str = "\u0007{fF";
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
                        i4 = 73;
                        break;
                    case at.g /*1*/:
                        i4 = 52;
                        break;
                    case at.i /*2*/:
                        i4 = 40;
                        break;
                    case at.o /*3*/:
                        i4 = 3;
                        break;
                    default:
                        i4 = 27;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u001a{nWL\bfm";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new b_(z[0], 0, 1);
                    SOFTWARE = new b_(z[2], 1, 2);
                    BUILTIN = new b_(z[1], 2, 3);
                    a = new b_[]{NONE, SOFTWARE, BUILTIN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u000baaOO\u0000z";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
