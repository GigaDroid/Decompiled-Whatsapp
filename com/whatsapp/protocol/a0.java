package com.whatsapp.protocol;

class a0 extends a {
    final cu a;
    final by b;
    final b5 c;
    final Runnable d;

    public void a(Exception exception) {
        if (this.a != null) {
            this.a.a(exception);
        }
    }

    public void a(cw cwVar, String str) {
        if (this.d != null) {
            this.d.run();
        }
    }

    a0(by byVar, Runnable runnable, b5 b5Var, cu cuVar) {
        this.b = byVar;
        this.d = runnable;
        this.c = b5Var;
        this.a = cuVar;
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }
}
