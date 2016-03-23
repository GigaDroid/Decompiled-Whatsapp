package com.whatsapp.gallerypicker;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum ar {
    ;
    
    public static final ar ALL;
    public static final ar EXTERNAL;
    public static final ar INTERNAL;
    public static final ar NONE;
    private static final ar[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "`^[z";
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
                        i4 = 46;
                        break;
                    case at.g /*1*/:
                        i4 = 17;
                        break;
                    case at.i /*2*/:
                        i4 = 21;
                        break;
                    case at.o /*3*/:
                        i4 = 63;
                        break;
                    default:
                        i4 = arj.Theme_checkedTextViewStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "kIAz5`PY";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "g_Az5`PY";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new ar(z[0], 0);
                    INTERNAL = new ar(z[3], 1);
                    EXTERNAL = new ar(z[2], 2);
                    ALL = new ar(z[1], 3);
                    a = new ar[]{NONE, INTERNAL, EXTERNAL, ALL};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "o]Y";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
