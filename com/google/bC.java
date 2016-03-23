package com.google;

import org.v;
import org.whispersystems.at;

public final class bC implements gj {
    private static final String[] z;
    private final int a;
    private bP b;
    private fn c;
    private fn d;
    private final hh e;
    private final String f;
    private final a7 g;

    static {
        int i;
        String[] strArr = new String[2];
        char[] toCharArray = "sR{>\u001e?\u001dfm_q\u001fw>M0\u0015wmJ(\u0002wc".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case v.m /*0*/:
                    i = 81;
                    break;
                case at.g /*1*/:
                    i = 114;
                    break;
                case at.i /*2*/:
                    i = 18;
                    break;
                case at.o /*3*/:
                    i = 77;
                    break;
                default:
                    i = 62;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "sR{>\u001e?\u001dfm_q\u001fw>M0\u0015wmJ(\u0002wc".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i = 81;
                    break;
                case at.g /*1*/:
                    i = 114;
                    break;
                case at.i /*2*/:
                    i = 18;
                    break;
                case at.o /*3*/:
                    i = 77;
                    break;
                default:
                    i = 62;
                    break;
            }
            cArr[length] = (char) (i ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public String m112a() {
        return this.f;
    }

    public hh d() {
        return this.e;
    }

    static void a(bC bCVar, bP bPVar) {
        bCVar.a(bPVar);
    }

    private void b() {
        gj a = hh.a(this.e).a(this.b.l(), this, g8.TYPES_ONLY);
        if (a instanceof fn) {
            this.c = (fn) a;
            a = hh.a(this.e).a(this.b.a(), this, g8.TYPES_ONLY);
            if (a instanceof fn) {
                this.d = (fn) a;
                return;
            }
            throw new fc((gj) this, '\"' + this.b.a() + z[1], null);
        }
        throw new fc((gj) this, '\"' + this.b.l() + z[0], null);
    }

    static void a(bC bCVar) {
        bCVar.b();
    }

    private void a(bP bPVar) {
        this.b = bPVar;
    }

    public ci m113b() {
        return a();
    }

    public String c() {
        return this.b.s();
    }

    bC(bP bPVar, hh hhVar, a7 a7Var, int i, ev evVar) {
        this(bPVar, hhVar, a7Var, i);
    }

    private bC(bP bPVar, hh hhVar, a7 a7Var, int i) {
        this.a = i;
        this.b = bPVar;
        this.e = hhVar;
        this.g = a7Var;
        this.f = a7Var.a() + '.' + bPVar.s();
        hh.a(hhVar).c(this);
    }

    public bP a() {
        return this.b;
    }
}
