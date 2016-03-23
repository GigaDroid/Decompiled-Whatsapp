package com.whatsapp.protocol;

class i extends a {
    final cu a;
    final by b;
    final Runnable c;
    final b5 d;

    i(by byVar, Runnable runnable, b5 b5Var, cu cuVar) {
        this.b = byVar;
        this.c = runnable;
        this.d = b5Var;
        this.a = cuVar;
    }

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
        if (this.d != null) {
            this.d.a(i);
        }
    }
}
