package com.whatsapp;

import com.whatsapp.protocol.c2;
import org.v;
import org.whispersystems.at;

class td implements Runnable {
    private static final String z;
    final kd a;
    final int b;
    final c2 c;
    final String d;
    final String e;

    static {
        char[] toCharArray = ">1h".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 73;
                    break;
                case at.g /*1*/:
                    i2 = 84;
                    break;
                case at.i /*2*/:
                    i2 = 10;
                    break;
                case at.o /*3*/:
                    i2 = 127;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    td(kd kdVar, c2 c2Var, String str, int i, String str2) {
        this.a = kdVar;
        this.c = c2Var;
        this.d = str;
        this.b = i;
        this.e = str2;
    }

    public void run() {
        App.a(this.d, aol.a(this.c.q), this.b);
        App.c(this.d, this.e, z);
    }
}
