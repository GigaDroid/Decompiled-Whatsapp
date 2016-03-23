package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.at;

final class w extends t {
    private static final String[] z;
    final bc a;
    final String b;

    static {
        String[] strArr = new String[2];
        String str = "(%V\u0012('!C?3";
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
                        i3 = 73;
                        break;
                    case at.g /*1*/:
                        i3 = 85;
                        break;
                    case at.i /*2*/:
                        i3 = 38;
                        break;
                    case at.o /*3*/:
                        i3 = 81;
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
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u000e:I6+,ub#.?0\u0006\u00107 uO\"g-<U0%%0B";
                    obj = null;
            }
        }
    }

    w(bc bcVar, String str) {
        this.a = bcVar;
        this.b = str;
    }

    public Object m762a() {
        return a();
    }

    public fs a() {
        if (!this.a.f()) {
            return this.a.c(this.b, z[0]);
        }
        throw new ee(z[1]);
    }
}
