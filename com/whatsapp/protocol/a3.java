package com.whatsapp.protocol;

import com.whatsapp.arj;
import java.util.Hashtable;
import org.v;
import org.whispersystems.at;

class a3 extends a {
    private static final String z;
    final by a;
    final b5 b;
    final Runnable c;

    static {
        char[] toCharArray = "\u0014\u0015nB^\u0010\u0002".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 100;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 47;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
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
        by.b(this.a).c(str, hashtable, hashtable2);
        if (this.c != null) {
            this.c.run();
        }
    }

    a3(by byVar, Runnable runnable, b5 b5Var) {
        this.a = byVar;
        this.c = runnable;
        this.b = b5Var;
    }
}
