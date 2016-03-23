package com.whatsapp.observablelistview;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum e {
    ;
    
    public static final e DOWN;
    public static final e STOP;
    public static final e UP;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "3%C.";
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
                        i4 = 119;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 20;
                        break;
                    case at.o /*3*/:
                        i4 = 96;
                        break;
                    default:
                        i4 = 91;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\":";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    STOP = new e(z[1], 0);
                    UP = new e(z[2], 1);
                    DOWN = new e(z[0], 2);
                    a = new e[]{STOP, UP, DOWN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "$>[0";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
