package com.whatsapp;

import org.v;
import org.whispersystems.at;

public class sf extends sc {
    private static final String z;
    l5 b;
    boolean c;

    static {
        char[] toCharArray = "\u0005a\u0019z(\u0015g\u0019j%\u0011}i".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 70;
                    break;
                case at.o /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public sf(l5 l5Var, boolean z) {
        this.b = l5Var;
        this.c = z;
    }

    public void b() {
        App.a(this.b, this.c);
    }

    public String c() {
        return z + this.b.p + "/" + this.c;
    }
}
