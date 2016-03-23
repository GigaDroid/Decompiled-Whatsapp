package com.whatsapp.gallerypicker;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

enum a_ {
    ;
    
    public static final a_ ALLOW;
    public static final a_ CANCEL;
    private static final a_[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "T]]&_";
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
                        i4 = 21;
                        break;
                    case at.g /*1*/:
                        i4 = 17;
                        break;
                    case at.i /*2*/:
                        i4 = 17;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_radioButtonStyle;
                        break;
                    default:
                        i4 = 8;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CANCEL = new a_(z[1], 0);
                    ALLOW = new a_(z[0], 1);
                    a = new a_[]{CANCEL, ALLOW};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "VP_*MY";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }
}
