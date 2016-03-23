package com.whatsapp.protocol;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class e extends a {
    private static final String z;
    final by a;
    final b5 b;
    final Runnable c;

    static {
        char[] toCharArray = "\u0001\u0003\rh \u0015".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.o /*3*/:
                    i2 = 1;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    e(by byVar, Runnable runnable, b5 b5Var) {
        this.a = byVar;
        this.c = runnable;
        this.b = b5Var;
    }

    public void a(cw cwVar, String str) {
        cw.a(cwVar.a(0), z);
        if (this.c != null) {
            this.c.run();
        }
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }
}
