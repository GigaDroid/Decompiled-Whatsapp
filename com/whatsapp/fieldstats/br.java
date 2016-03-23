package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum br {
    ;
    
    public static final br APPLE;
    public static final br FACEBOOK;
    public static final br FOURSQUARE;
    public static final br GOOGLE;
    private static final br[] b;
    private static final String[] z;
    private final int a;

    private br(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[4];
        String str = "I7ug.";
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
                        i4 = 8;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 37;
                        break;
                    case at.o /*3*/:
                        i4 = 43;
                        break;
                    default:
                        i4 = arj.Theme_seekBarStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "N(py8Y2dy.";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "N&fn)G(n";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    GOOGLE = new br(z[1], 0, 1);
                    FOURSQUARE = new br(z[2], 1, 2);
                    FACEBOOK = new br(z[3], 2, 3);
                    APPLE = new br(z[0], 3, 4);
                    b = new br[]{GOOGLE, FOURSQUARE, FACEBOOK, APPLE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "O(jl'M";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }
}
