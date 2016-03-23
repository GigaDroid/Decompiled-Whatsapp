package com.whatsapp.protocol;

class af extends a {
    final Runnable a;
    final cu b;
    final by c;
    final b5 d;

    af(by byVar, Runnable runnable, b5 b5Var, cu cuVar) {
        this.c = byVar;
        this.a = runnable;
        this.d = b5Var;
        this.b = cuVar;
    }

    public void a(cw cwVar, String str) {
        if (this.a != null) {
            this.a.run();
        }
    }

    public void a(int i) {
        if (this.d != null) {
            this.d.a(i);
        }
    }

    public void a(Exception exception) {
        if (this.b != null) {
            this.b.a(exception);
        }
    }
}
