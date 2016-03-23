package com.whatsapp.protocol;

import java.util.Vector;
import org.v;
import org.whispersystems.at;

class a5 extends a {
    private static final String[] z;
    final by a;
    final b5 b;
    final Runnable c;

    static {
        String[] strArr = new String[3];
        String str = " 9";
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
                        i3 = 93;
                        break;
                    case at.i /*2*/:
                        i3 = 49;
                        break;
                    case at.o /*3*/:
                        i3 = 47;
                        break;
                    default:
                        i3 = 54;
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
                    str = "./^ZF";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "%8PYS";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void a(cw cwVar, String str) {
        cw f = cwVar.f(z[1]);
        if (f != null) {
            Vector vector = new Vector();
            by.a(this.a, f, vector, z[2], z[0]);
            if (vector.size() > 0) {
                by.b(this.a).b(vector);
            }
        }
        if (this.c != null) {
            this.c.run();
        }
    }

    a5(by byVar, Runnable runnable, b5 b5Var) {
        this.a = byVar;
        this.c = runnable;
        this.b = b5Var;
    }
}
