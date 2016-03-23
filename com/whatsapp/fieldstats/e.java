package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum e {
    ;
    
    public static final e DIFFERENT_COUNTRY;
    public static final e SAME_COUNTRY;
    private static final e[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[2];
        String str = "6.EM~& ]Fu76";
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
                        i4 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.g /*1*/:
                        i4 = 111;
                        break;
                    case at.i /*2*/:
                        i4 = 8;
                        break;
                    case at.o /*3*/:
                        i4 = 8;
                        break;
                    default:
                        i4 = 33;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SAME_COUNTRY = new e(z[0], 0, 1);
                    DIFFERENT_COUNTRY = new e(z[1], 1, 2);
                    a = new e[]{SAME_COUNTRY, DIFFERENT_COUNTRY};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "!&NNd7*F\\~& ]Fu76";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    public int getCode() {
        return this.b;
    }

    private e(int i) {
        this.b = i;
    }
}
