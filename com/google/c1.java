package com.google;

import com.whatsapp.arj;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.v;
import org.whispersystems.at;

public final class c1 implements gj, eR {
    private static final String z;
    private final fn a;
    private final int b;
    private fG[] c;
    private bv d;
    private final String e;
    private final hh f;

    static {
        char[] toCharArray = "\u0002\b.G*g\u000b.Y-g\u00054D-&\u000f5\n83F7O84\u0012{E7\"F-K52\u0003u".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 71;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 91;
                    break;
                case at.o /*3*/:
                    i2 = 42;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    c1(bv bvVar, hh hhVar, fn fnVar, int i, ev evVar) {
        this(bvVar, hhVar, fnVar, i);
    }

    private void a(bv bvVar) {
        this.d = bvVar;
        for (int i = 0; i < this.c.length; i++) {
            fG.a(this.c[i], bvVar.a(i));
        }
    }

    public dJ findValueByNumber(int i) {
        return a(i);
    }

    public String a() {
        return this.e;
    }

    static void a(c1 c1Var, bv bvVar) {
        c1Var.a(bvVar);
    }

    public List m90a() {
        return Collections.unmodifiableList(Arrays.asList(this.c));
    }

    public ci m91b() {
        return b();
    }

    public bv b() {
        return this.d;
    }

    public fG a(String str) {
        gj a = hh.a(this.f).a(this.e + '.' + str);
        if (a == null || !(a instanceof fG)) {
            return null;
        }
        return (fG) a;
    }

    public hh d() {
        return this.f;
    }

    public fG a(int i) {
        return (fG) it.b(hh.a(this.f)).get(new df(this, i));
    }

    public String c() {
        return this.d.h();
    }

    private c1(bv bvVar, hh hhVar, fn fnVar, int i) {
        this.b = i;
        this.d = bvVar;
        this.e = O.b(hhVar, fnVar, bvVar.h());
        this.f = hhVar;
        this.a = fnVar;
        if (bvVar.m() == 0) {
            throw new fc((gj) this, z, null);
        }
        this.c = new fG[bvVar.m()];
        for (int i2 = 0; i2 < bvVar.m(); i2++) {
            this.c[i2] = new fG(bvVar.a(i2), hhVar, this, i2, null);
        }
        hh.a(hhVar).c(this);
    }
}
