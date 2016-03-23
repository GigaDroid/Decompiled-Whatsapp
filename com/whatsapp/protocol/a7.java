package com.whatsapp.protocol;

class a7 extends a {
    final cu a;
    final b5 b;
    final Runnable c;
    final by d;

    public void a(Exception exception) {
        if (this.a != null) {
            this.a.a(exception);
        }
    }

    public void a(cw cwVar, String str) {
        if (this.c != null) {
            this.c.run();
        }
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    a7(by byVar, Runnable runnable, b5 b5Var, cu cuVar) {
        this.d = byVar;
        this.c = runnable;
        this.b = b5Var;
        this.a = cuVar;
    }
}
