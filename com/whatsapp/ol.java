package com.whatsapp;

import org.v;
import org.whispersystems.at;

final class ol {
    private static final String[] z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    static {
        String[] strArr = new String[4];
        String str = "/Zm:\u0003v\nh $b\u000eat";
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
                        i3 = 3;
                        break;
                    case at.g /*1*/:
                        i3 = 122;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 71;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "B\u001e`\u001b\"p\u000fh=<t\u001bw\u001a2`\u0019a:4>";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "/Zg!&w/j(5`\u0012m?\"gG";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "/Zg!&w;`-\"gG";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ol(boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = z;
        this.d = z2;
        this.c = z3;
        this.a = z4;
    }

    public String toString() {
        return z[2] + this.b + z[1] + this.d + z[0] + this.a + z[3] + this.c + '}';
    }
}
