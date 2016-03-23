package com.google;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class fn implements gj {
    private final hh a;
    private br b;
    private final e0[] c;
    private final fn[] d;
    private final String e;
    private final e0[] f;
    private final c1[] g;
    private final int h;
    private final fn i;

    fn(br brVar, hh hhVar, fn fnVar, int i, ev evVar) {
        this(brVar, hhVar, fnVar, i);
    }

    public String a() {
        return this.e;
    }

    public boolean b(int i) {
        for (bR bRVar : this.b.i()) {
            if (bRVar.e() <= i && i < bRVar.l()) {
                return true;
            }
        }
        return false;
    }

    public ci b() {
        return c();
    }

    private void d() {
        int i = 0;
        for (fn d : this.d) {
            d.d();
        }
        for (e0 b : this.c) {
            e0.b(b);
        }
        e0[] e0VarArr = this.f;
        int length = e0VarArr.length;
        while (i < length) {
            e0.b(e0VarArr[i]);
            i++;
        }
    }

    public List m93b() {
        return Collections.unmodifiableList(Arrays.asList(this.c));
    }

    public List e() {
        return Collections.unmodifiableList(Arrays.asList(this.d));
    }

    public String m94c() {
        return this.b.f();
    }

    public List g() {
        return Collections.unmodifiableList(Arrays.asList(this.g));
    }

    static void a(fn fnVar, br brVar) {
        fnVar.a(brVar);
    }

    public br c() {
        return this.b;
    }

    public hh m95d() {
        return this.a;
    }

    private fn(br brVar, hh hhVar, fn fnVar, int i) {
        int i2;
        this.h = i;
        this.b = brVar;
        this.e = O.b(hhVar, fnVar, brVar.f());
        this.a = hhVar;
        this.i = fnVar;
        this.d = new fn[brVar.n()];
        for (int i3 = 0; i3 < brVar.n(); i3++) {
            this.d[i3] = new fn(brVar.i(i3), hhVar, this, i3);
        }
        this.g = new c1[brVar.d()];
        for (i2 = 0; i2 < brVar.d(); i2++) {
            this.g[i2] = new c1(brVar.g(i2), hhVar, this, i2, null);
        }
        this.c = new e0[brVar.s()];
        for (i2 = 0; i2 < brVar.s(); i2++) {
            this.c[i2] = new e0(brVar.a(i2), hhVar, this, i2, false, null);
        }
        this.f = new e0[brVar.A()];
        for (i2 = 0; i2 < brVar.A(); i2++) {
            this.f[i2] = new e0(brVar.f(i2), hhVar, this, i2, true, null);
        }
        hh.a(hhVar).c(this);
    }

    public cl f() {
        return this.b.w();
    }

    public e0 a(int i) {
        return (e0) it.a(hh.a(this.a)).get(new df(this, i));
    }

    static void a(fn fnVar) {
        fnVar.d();
    }

    private void a(br brVar) {
        int i;
        int i2 = 0;
        this.b = brVar;
        for (i = 0; i < this.d.length; i++) {
            this.d[i].a(brVar.i(i));
        }
        for (i = 0; i < this.g.length; i++) {
            c1.a(this.g[i], brVar.g(i));
        }
        for (i = 0; i < this.c.length; i++) {
            e0.a(this.c[i], brVar.a(i));
        }
        while (i2 < this.f.length) {
            e0.a(this.f[i2], brVar.f(i2));
            i2++;
        }
    }

    public List m92a() {
        return Collections.unmodifiableList(Arrays.asList(this.f));
    }
}
