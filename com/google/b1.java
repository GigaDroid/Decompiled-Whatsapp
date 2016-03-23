package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public final class b1 {
    private static final String z;
    private hX a;
    private final cW b;

    static {
        char[] toCharArray = "p9\u0004QT[*\u000fB\u0006_%\u0019D\u0006P5J^I\\}\u0004EJ^~".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 50;
                    break;
                case at.g /*1*/:
                    i2 = 80;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String toString() {
        try {
            return d().toString();
        } catch (aN e) {
            return "";
        }
    }

    public b1 e() {
        return new b1(this.b.a(this.b.d().e()));
    }

    public boolean a() {
        return this.b.d().a();
    }

    public d_ a(int i, d_ d_Var) {
        return this.b.a(i, d_Var);
    }

    public int c() {
        return this.b.a();
    }

    public b1(cW cWVar) {
        if (cWVar == null) {
            throw new IllegalArgumentException(z);
        }
        this.b = cWVar;
    }

    public int b() {
        return this.b.b();
    }

    public hX d() {
        try {
            if (this.a == null) {
                this.a = this.b.c();
            }
            return this.a;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
