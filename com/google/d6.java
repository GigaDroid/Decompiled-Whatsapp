package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum d6 {
    ;
    
    public static final d6 AUTO;
    public static final d6 BYTE;
    public static final d6 NUMERIC;
    public static final d6 TEXT;
    public static int a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "*dbI";
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
                        i4 = arj.Theme_editTextStyle;
                        break;
                    case at.g /*1*/:
                        i4 = 61;
                        break;
                    case at.i /*2*/:
                        i4 = 54;
                        break;
                    case at.o /*3*/:
                        i4 = 12;
                        break;
                    default:
                        i4 = 110;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = ")hbC";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "&h{I<!~";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    AUTO = new d6(z[2], 0);
                    TEXT = new d6(z[1], 1);
                    BYTE = new d6(z[0], 2);
                    NUMERIC = new d6(z[3], 3);
                    b = new d6[]{AUTO, TEXT, BYTE, NUMERIC};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "<xnX";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
