package com.whatsapp.protocol;

class ap extends a {
    final Runnable a;
    final b5 b;
    final cu c;
    final by d;
    final String e;

    public void a(cw cwVar, String str) {
        if (this.a != null) {
            this.a.run();
        }
    }

    public void a(Exception exception) {
        if (this.c != null) {
            this.c.a(exception);
        }
    }

    ap(by byVar, Runnable runnable, b5 b5Var, String str, cu cuVar) {
        this.d = byVar;
        this.a = runnable;
        this.b = b5Var;
        this.e = str;
        this.c = cuVar;
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
        by.c(this.d).a(i, this.e);
    }
}
