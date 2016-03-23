package com.whatsapp.protocol;

class aq extends a {
    final b5 a;
    final cu b;
    final Runnable c;
    final by d;

    public void a(cw cwVar, String str) {
        if (this.c != null) {
            this.c.run();
        }
    }

    aq(by byVar, Runnable runnable, b5 b5Var, cu cuVar) {
        this.d = byVar;
        this.c = runnable;
        this.a = b5Var;
        this.b = cuVar;
    }

    public void a(int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public void a(Exception exception) {
        if (this.b != null) {
            this.b.a(exception);
        }
    }
}
