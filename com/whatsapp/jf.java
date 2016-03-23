package com.whatsapp;

import org.v;
import org.whispersystems.at;

enum jf {
    ;
    
    public static final jf AGREE_1;
    public static final jf AGREE_2;
    public static final jf AGREE_NONE;
    private static final jf[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "^C\u001c\b\r@6";
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
                        i4 = 31;
                        break;
                    case at.g /*1*/:
                        i4 = 4;
                        break;
                    case at.i /*2*/:
                        i4 = 78;
                        break;
                    case at.o /*3*/:
                        i4 = 77;
                        break;
                    default:
                        i4 = 72;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "^C\u001c\b\r@5";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    AGREE_NONE = new jf(z[1], 0);
                    AGREE_1 = new jf(z[2], 1);
                    AGREE_2 = new jf(z[0], 2);
                    a = new jf[]{AGREE_NONE, AGREE_1, AGREE_2};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "^C\u001c\b\r@J\u0001\u0003\r";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
