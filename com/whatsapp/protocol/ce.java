package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

public final class ce {
    private static final String[] z;
    public final String a;
    public final String b;

    static {
        String[] strArr = new String[2];
        String str = "U\u0018)X;r\b5u1{\u0004m)";
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
                        i3 = 30;
                        break;
                    case at.g /*1*/:
                        i3 = 125;
                        break;
                    case at.i /*2*/:
                        i3 = 80;
                        break;
                    case at.o /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = 90;
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
                    str = "2]&o6k\u0018m)";
                    obj = null;
            }
        }
    }

    public String toString() {
        return z[0] + this.a + '\'' + z[1] + this.b + '\'' + '}';
    }

    public ce(String str, String str2) {
        if (str2 == null || str == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.a = str;
        this.b = str2;
    }
}
