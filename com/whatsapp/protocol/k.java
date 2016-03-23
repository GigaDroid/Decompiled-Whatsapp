package com.whatsapp.protocol;

class k extends a {
    final by a;
    final Runnable b;
    final b5 c;

    public void a(cw cwVar, String str) {
        if (this.b != null) {
            this.b.run();
        }
    }

    k(by byVar, Runnable runnable, b5 b5Var) {
        this.a = byVar;
        this.b = runnable;
        this.c = b5Var;
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }
}
