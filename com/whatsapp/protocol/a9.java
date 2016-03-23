package com.whatsapp.protocol;

import java.util.Hashtable;
import org.v;
import org.whispersystems.at;

class a9 extends a {
    private static final String z;
    final by a;
    final Runnable b;
    final b5 c;

    static {
        char[] toCharArray = "x@'r=o".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 10;
                    break;
                case at.g /*1*/:
                    i2 = 37;
                    break;
                case at.i /*2*/:
                    i2 = 74;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a9(by byVar, Runnable runnable, b5 b5Var) {
        this.a = byVar;
        this.b = runnable;
        this.c = b5Var;
    }

    public void a(cw cwVar, String str) {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        by.a(this.a, cwVar, hashtable, hashtable2, z);
        by.b(this.a).d(str, hashtable, hashtable2);
        if (this.b != null) {
            this.b.run();
        }
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }
}
