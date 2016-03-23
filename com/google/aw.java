package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum aw {
    ;
    
    public static final aw FROM_DEFAULT_COUNTRY;
    public static final aw FROM_NUMBER_WITHOUT_PLUS_SIGN;
    public static final aw FROM_NUMBER_WITH_IDD;
    public static final aw FROM_NUMBER_WITH_PLUS_SIGN;
    private static final aw[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "58d,F=?f#\\!5|(M;5b%]";
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
                        i4 = 115;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 43;
                        break;
                    case at.o /*3*/:
                        i4 = 97;
                        break;
                    default:
                        i4 = 25;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "58d,F=?f#\\!5|(M;%~5F#&~2F #l/";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "58d,F=?f#\\!5|(M;5{-L 5x(^=";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FROM_NUMBER_WITH_PLUS_SIGN = new aw(z[3], 0);
                    FROM_NUMBER_WITH_IDD = new aw(z[0], 1);
                    FROM_NUMBER_WITHOUT_PLUS_SIGN = new aw(z[2], 2);
                    FROM_DEFAULT_COUNTRY = new aw(z[1], 3);
                    a = new aw[]{FROM_NUMBER_WITH_PLUS_SIGN, FROM_NUMBER_WITH_IDD, FROM_NUMBER_WITHOUT_PLUS_SIGN, FROM_DEFAULT_COUNTRY};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "58d,F7/m L?>t\"V&$\u007f3@";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
