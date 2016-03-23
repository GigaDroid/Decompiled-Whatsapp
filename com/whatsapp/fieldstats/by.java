package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum by {
    ;
    
    public static final by MISSING_HEADER;
    public static final by NO_TIMESTAMP;
    public static final by PARSE;
    public static final by TIME_SHIFT;
    public static final by TOO_OLD;
    private static final by[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[5];
        String str = "E&CU\u0001]-";
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
                        i4 = 17;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_radioButtonStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 12;
                        break;
                    case at.o /*3*/:
                        i4 = 10;
                        break;
                    default:
                        i4 = 78;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "_&S^\u0007\\,_^\u000f\\9";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "E AO\u0011B!EL\u001a";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\\ _Y\u0007_.SB\u000bP-IX";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NO_TIMESTAMP = new by(z[2], 0, 1);
                    TIME_SHIFT = new by(z[3], 1, 2);
                    TOO_OLD = new by(z[0], 2, 4);
                    PARSE = new by(z[1], 3, 3);
                    MISSING_HEADER = new by(z[4], 4, 5);
                    a = new by[]{NO_TIMESTAMP, TIME_SHIFT, TOO_OLD, PARSE, MISSING_HEADER};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "A(^Y\u000b";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }

    private by(int i) {
        this.b = i;
    }
}
