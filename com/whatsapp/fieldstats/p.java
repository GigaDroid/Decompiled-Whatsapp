package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum p {
    ;
    
    public static final p EXISTING;
    public static final p FROM_LIMBO;
    public static final p NEW;
    public static final p WIPED;
    private static final p[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[4];
        String str = "8Q4\u001c:2J6\u0013*";
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
                        i4 = 126;
                        break;
                    case at.g /*1*/:
                        i4 = 3;
                        break;
                    case at.i /*2*/:
                        i4 = 123;
                        break;
                    case at.o /*3*/:
                        i4 = 81;
                        break;
                    default:
                        i4 = arj.Theme_buttonStyleSmall;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "0F,";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = ";[2\u000217M<";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NEW = new p(z[2], 0, 1);
                    EXISTING = new p(z[3], 1, 2);
                    FROM_LIMBO = new p(z[0], 2, 3);
                    WIPED = new p(z[1], 3, 4);
                    a = new p[]{NEW, EXISTING, FROM_LIMBO, WIPED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = ")J+\u0014!";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }

    private p(int i) {
        this.b = i;
    }
}
