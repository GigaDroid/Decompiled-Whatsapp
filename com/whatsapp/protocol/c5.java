package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

public class c5 extends ct {
    private static final String[] z;
    public long f;

    static {
        String[] strArr = new String[2];
        String str = "GDe,l]@c$";
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
                        i3 = 51;
                        break;
                    case at.g /*1*/:
                        i3 = 33;
                        break;
                    case at.i /*2*/:
                        i3 = 23;
                        break;
                    case at.o /*3*/:
                        i3 = 65;
                        break;
                    default:
                        i3 = 5;
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
                    str = "WTe qZNy";
                    obj = null;
            }
        }
    }

    public c5(ct ctVar, long j) {
        super(ctVar);
        this.f = j;
    }

    public cw a() {
        if (this.f <= 0) {
            return null;
        }
        return new cw(z[0], new ce[]{new ce(z[1], String.valueOf(this.f))});
    }
}
