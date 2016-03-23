package com.whatsapp.util;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class cm {
    private static final String[] z;
    public int a;
    public int b;
    public int c;

    static {
        String[] strArr = new String[3];
        String str = "\u0010\"B\u0001\u0004\\k";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 75;
                        break;
                    case at.i /*2*/:
                        i3 = 38;
                        break;
                    case at.o /*3*/:
                        i3 = 100;
                        break;
                    default:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "JkE\u000b\u0005\u0012*O\n\u000e\u0014q\u0006";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "JkG\u0011\u000f\u000f$\u001cD";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public cm() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    public String toString() {
        return z[0] + this.a + z[1] + this.b + z[2] + this.c;
    }
}
