package com.whatsapp;

import com.whatsapp.protocol.c3;
import org.v;
import org.whispersystems.at;

public class sg extends sc {
    private static final String z;
    c3 b;
    int c;

    static {
        char[] toCharArray = "-@^jY;msbI*\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 92;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 7;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public sg(c3 c3Var, int i) {
        this.b = c3Var;
        this.c = i;
    }

    public String c() {
        return z + this.b.toString();
    }

    public void b() {
        App.a(this.b, this.c);
    }
}
