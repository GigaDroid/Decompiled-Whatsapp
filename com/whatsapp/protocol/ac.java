package com.whatsapp.protocol;

class ac extends a {
    final cu a;
    final by b;
    final b5 c;
    final Runnable d;

    public void a(cw cwVar, String str) {
        if (this.d != null) {
            this.d.run();
        }
    }

    public void a(Exception exception) {
        if (this.a != null) {
            this.a.a(exception);
        }
    }

    ac(by byVar, Runnable runnable, b5 b5Var, cu cuVar) {
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
