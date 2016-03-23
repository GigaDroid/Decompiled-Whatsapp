package com.whatsapp.protocol;

class a6 extends a {
    final b5 a;
    final by b;
    final Runnable c;
    final cu d;

    public void a(int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public void a(Exception exception) {
        if (this.d != null) {
            this.d.a(exception);
        }
    }

    public void a(cw cwVar, String str) {
        if (this.c != null) {
            this.c.run();
        }
    }

    a6(by byVar, Runnable runnable, b5 b5Var, cu cuVar) {
        this.b = byVar;
        this.c = runnable;
        this.a = b5Var;
        this.d = cuVar;
    }
}
