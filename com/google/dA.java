package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

final class dA {
    private static final String[] z;
    private final e4 a;
    private final fx b;
    private final boolean c;
    private final fx d;

    static {
        String[] strArr = new String[5];
        String str = ":,";
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
                        i3 = 26;
                        break;
                    case at.g /*1*/:
                        i3 = 113;
                        break;
                    case at.i /*2*/:
                        i3 = 97;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ":KA";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ":]A";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "AQ";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "t\u0004\r\u0005";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    e4 b() {
        return this.a;
    }

    public String toString() {
        return z[4] + this.b + z[3] + this.d + z[2] + (this.a == null ? z[1] : Integer.valueOf(this.a.c())) + z[0];
    }

    dA(fx fxVar, fx fxVar2, e4 e4Var, boolean z) {
        this.b = fxVar;
        this.d = fxVar2;
        this.a = e4Var;
        this.c = z;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }

    fx d() {
        return this.d;
    }

    public int hashCode() {
        return (a(this.b) ^ a(this.d)) ^ a(this.a);
    }

    private static int a(Object obj) {
        return obj == null ? 0 : obj.hashCode();
    }

    fx c() {
        return this.b;
    }

    public boolean a() {
        return this.d == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dA)) {
            return false;
        }
        dA dAVar = (dA) obj;
        if (a(this.b, dAVar.b) && a(this.d, dAVar.d) && a(this.a, dAVar.a)) {
            return true;
        }
        return false;
    }
}
