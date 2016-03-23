package com.whatsapp.util;

import org.v;
import org.whispersystems.at;

public class bg {
    private static final String[] z;
    public int a;
    public int b;

    static {
        String[] strArr = new String[2];
        String str = "$O._\u0000|\u000e$^\u000bzUm";
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
                        i3 = 8;
                        break;
                    case at.g /*1*/:
                        i3 = 111;
                        break;
                    case at.i /*2*/:
                        i3 = 77;
                        break;
                    case at.o /*3*/:
                        i3 = 48;
                        break;
                    default:
                        i3 = 110;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "i\u001a)Y\u00012O";
                    obj = null;
            }
        }
    }

    public String toString() {
        return z[1] + this.a + z[0] + this.b;
    }

    public bg(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public bg() {
        this(0, 0);
    }

    public bg(int i) {
        this(0, i);
    }
}
