package com.whatsapp;

import org.v;
import org.whispersystems.at;

public class sj extends sc {
    private static final String z;
    String b;
    boolean c;

    static {
        char[] toCharArray = "|m(h\u0001av\u0004~=\u007fz\u0014c\u0012dz\u0019~\u0011-".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = 31;
                    break;
                case at.i /*2*/:
                    i2 = 119;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public sj(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public boolean a() {
        return this.c || super.a();
    }

    public String c() {
        return z + this.b;
    }

    public void b() {
        App.a(this.b, this.c);
    }
}
