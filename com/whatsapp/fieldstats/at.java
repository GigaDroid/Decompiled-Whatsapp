package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;

public enum at {
    ;
    
    public static final at JNI;
    public static final at OPENSLES;
    private static final at[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[2];
        String str = "\u000b(G";
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
                        i4 = 65;
                        break;
                    case org.whispersystems.at.g /*1*/:
                        i4 = arj.Theme_checkboxStyle;
                        break;
                    case org.whispersystems.at.i /*2*/:
                        i4 = 14;
                        break;
                    case org.whispersystems.at.o /*3*/:
                        i4 = 90;
                        break;
                    default:
                        i4 = 121;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    JNI = new at(z[0], 0, 1);
                    OPENSLES = new at(z[1], 1, 2);
                    a = new at[]{JNI, OPENSLES};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u000e6K\u0014*\r#]";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    public int getCode() {
        return this.b;
    }

    private at(int i) {
        this.b = i;
    }
}
