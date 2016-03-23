package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum a5 {
    ;
    
    public static final a5 CANCEL;
    public static final a5 CURRENT_LOCATION;
    public static final a5 CUSTOM_LOCATION;
    public static final a5 PLACE;
    private static final a5[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[4];
        String str = "[mv&\u0019Vl{8\u0013[yp=\u0013V";
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
                        i4 = 24;
                        break;
                    case at.g /*1*/:
                        i4 = 56;
                        break;
                    case at.i /*2*/:
                        i4 = 36;
                        break;
                    case at.o /*3*/:
                        i4 = 116;
                        break;
                    default:
                        i4 = 92;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "Hte7\u0019";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "[yj7\u0019T";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CANCEL = new a5(z[3], 0, 1);
                    CURRENT_LOCATION = new a5(z[0], 1, 2);
                    CUSTOM_LOCATION = new a5(z[1], 2, 3);
                    PLACE = new a5(z[2], 3, 4);
                    b = new a5[]{CANCEL, CURRENT_LOCATION, CUSTOM_LOCATION, PLACE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "[mw \u0013Ugh;\u001fYlm;\u0012";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private a5(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
