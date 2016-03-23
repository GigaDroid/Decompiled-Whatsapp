package com.google;

public final class fG implements gj, dJ {
    private final c1 a;
    private bT b;
    private final String c;
    private final hh d;
    private final int e;

    public ci m97b() {
        return c();
    }

    public c1 a() {
        return this.a;
    }

    static void a(fG fGVar, bT bTVar) {
        fGVar.a(bTVar);
    }

    public String m98c() {
        return this.b.i();
    }

    public hh d() {
        return this.d;
    }

    fG(bT bTVar, hh hhVar, c1 c1Var, int i, ev evVar) {
        this(bTVar, hhVar, c1Var, i);
    }

    public int getNumber() {
        return this.b.e();
    }

    public bT c() {
        return this.b;
    }

    public String m96a() {
        return this.c;
    }

    public int b() {
        return this.e;
    }

    private void a(bT bTVar) {
        this.b = bTVar;
    }

    private fG(bT bTVar, hh hhVar, c1 c1Var, int i) {
        this.e = i;
        this.b = bTVar;
        this.d = hhVar;
        this.a = c1Var;
        this.c = c1Var.a() + '.' + bTVar.i();
        hh.a(hhVar).c(this);
        hh.a(hhVar).a(this);
    }
}
