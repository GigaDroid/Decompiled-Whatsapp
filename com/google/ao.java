package com.google;

import org.v;
import org.whispersystems.at;

public class ao extends Exception {
    private static final String[] z;
    private String a;
    private dk b;

    static {
        String[] strArr = new String[2];
        String str = "\u0017i";
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
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = 73;
                        break;
                    case at.i /*2*/:
                        i3 = 48;
                        break;
                    case at.o /*3*/:
                        i3 = 98;
                        break;
                    default:
                        i3 = 30;
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
                    str = "|;B\rl\u0019=I\u0012{\u0003i";
                    obj = null;
            }
        }
    }

    public dk a() {
        return this.b;
    }

    public String toString() {
        return z[1] + this.b + z[0] + this.a;
    }

    public ao(dk dkVar, String str) {
        super(str);
        this.a = str;
        this.b = dkVar;
    }
}
