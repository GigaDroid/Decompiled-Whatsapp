package com.whatsapp;

import org.v;
import org.whispersystems.at;

public class a42 {
    private static a42 b;
    public static int c;
    private static boolean d;
    private static final String z;
    boolean a;
    ce e;

    public a42() {
        int i = c;
        this.a = false;
        if (WAAppCompatActivity.c != 0) {
            c = i + 1;
        }
    }

    public void b() {
        int i = c;
        this.e = tp.a(z);
        this.e.a(tb.FIRST_INIT, d);
        this.e.e();
        d = false;
        this.a = true;
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }

    static {
        char[] toCharArray = "6:ohI\u0014\u0013ikx:8rok\u0012/\u007f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 123;
                    break;
                case at.g /*1*/:
                    i2 = 91;
                    break;
                case at.i /*2*/:
                    i2 = 6;
                    break;
                case at.o /*3*/:
                    i2 = 6;
                    break;
                default:
                    i2 = 29;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        d = true;
    }

    public static a42 a() {
        if (b == null) {
            b = new a42();
        }
        return b;
    }

    public void a(long j) {
        if (this.a) {
            this.e.a(j);
            this.e = null;
            this.a = false;
        }
    }
}
