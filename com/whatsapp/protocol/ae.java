package com.whatsapp.protocol;

import java.util.Hashtable;
import org.v;
import org.whispersystems.at;

class ae extends a {
    private static final String z;
    final b5 a;
    final Runnable b;
    final by c;

    static {
        char[] toCharArray = "\u000fDY".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 110;
                    break;
                case at.g /*1*/:
                    i2 = 32;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 31;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ae(by byVar, Runnable runnable, b5 b5Var) {
        this.c = byVar;
        this.b = runnable;
        this.a = b5Var;
    }

    public void a(cw cwVar, String str) {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        by.a(this.c, cwVar, hashtable, hashtable2, z);
        by.b(this.c).a(str, hashtable, hashtable2);
        if (this.b != null) {
            this.b.run();
        }
    }

    public void a(int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }
}
