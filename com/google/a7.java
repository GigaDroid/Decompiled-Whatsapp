package com.google;

public final class a7 implements gj {
    private bC[] a;
    private final int b;
    private final String c;
    private final hh d;
    private bx e;

    private void a(bx bxVar) {
        this.e = bxVar;
        for (int i = 0; i < this.a.length; i++) {
            bC.a(this.a[i], bxVar.b(i));
        }
    }

    public String c() {
        return this.e.f();
    }

    static void a(a7 a7Var) {
        a7Var.a();
    }

    private void a() {
        for (bC a : this.a) {
            bC.a(a);
        }
    }

    static void a(a7 a7Var, bx bxVar) {
        a7Var.a(bxVar);
    }

    a7(bx bxVar, hh hhVar, int i, ev evVar) {
        this(bxVar, hhVar, i);
    }

    public ci m105b() {
        return b();
    }

    public String m104a() {
        return this.c;
    }

    public hh d() {
        return this.d;
    }

    public bx b() {
        return this.e;
    }

    private a7(bx bxVar, hh hhVar, int i) {
        this.b = i;
        this.e = bxVar;
        this.c = O.b(hhVar, null, bxVar.f());
        this.d = hhVar;
        this.a = new bC[bxVar.p()];
        for (int i2 = 0; i2 < bxVar.p(); i2++) {
            this.a[i2] = new bC(bxVar.b(i2), hhVar, this, i2, null);
        }
        hh.a(hhVar).c(this);
    }
}
