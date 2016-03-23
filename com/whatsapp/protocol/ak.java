package com.whatsapp.protocol;

import com.whatsapp.arj;
import java.util.Hashtable;
import org.v;
import org.whispersystems.at;

class ak extends a {
    private static final String z;
    final by a;
    final b5 b;
    final Runnable c;

    static {
        char[] toCharArray = "7\u0013b\u0006\u001d6".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 118;
                    break;
                case at.i /*2*/:
                    i2 = 15;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                default:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ak(by byVar, Runnable runnable, b5 b5Var) {
        this.a = byVar;
        this.c = runnable;
        this.b = b5Var;
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void a(cw cwVar, String str) {
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        by.a(this.a, cwVar, hashtable, hashtable2, z);
        by.b(this.a).b(str, hashtable, hashtable2);
        if (this.c != null) {
            this.c.run();
        }
    }
}
