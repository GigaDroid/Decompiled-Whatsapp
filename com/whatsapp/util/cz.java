package com.whatsapp.util;

import org.v;
import org.whispersystems.at;

public class cz extends co {
    private static final String[] z;
    protected co[] d;

    static {
        String[] strArr = new String[4];
        String str = "\u000b\u0000#t.O\u0011.s";
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
                        i3 = 43;
                        break;
                    case at.g /*1*/:
                        i3 = 99;
                        break;
                    case at.i /*2*/:
                        i3 = 75;
                        break;
                    case at.o /*3*/:
                        i3 = 29;
                        break;
                    default:
                        i3 = 66;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000bK";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u000b\u0000#t.O";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000b\u00012i'XJk0b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public co[] a() {
        return this.d;
    }

    protected cz(long j, String str, co[] coVarArr) {
        super(j, str);
        this.d = coVarArr;
    }

    public String toString() {
        return this.b + z[2] + this.c + z[1] + this.d.length + (this.d.length == 1 ? z[3] : z[0]);
    }
}
