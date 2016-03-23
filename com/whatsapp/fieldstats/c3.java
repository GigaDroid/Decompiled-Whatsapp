package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum c3 {
    ;
    
    public static final c3 PLAYBACK;
    public static final c3 TO_FILE;
    private static final c3[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private c3(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[2];
        String str = "y'xAQa-";
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
                        i4 = 45;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_editTextStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 39;
                        break;
                    case at.o /*3*/:
                        i4 = 7;
                        break;
                    default:
                        i4 = 24;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    PLAYBACK = new c3(z[1], 0, 1);
                    TO_FILE = new c3(z[0], 1, 2);
                    b = new c3[]{PLAYBACK, TO_FILE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "}$f^Zl+l";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }
}
